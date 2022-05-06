package bo.edu.ucb.ingsoft.deliverybot.delivery.chat;

import bo.edu.ucb.ingsoft.deliverybot.delivery.bl.ClientBl;
import bo.edu.ucb.ingsoft.deliverybot.delivery.bl.OrderBl;
import bo.edu.ucb.ingsoft.deliverybot.delivery.dto.ClientDto;
import bo.edu.ucb.ingsoft.deliverybot.delivery.dto.OrderDto;
import bo.edu.ucb.ingsoft.deliverybot.delivery.dto.PlateInOrderDto;
import bo.edu.ucb.ingsoft.deliverybot.delivery.util.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderProcessImpl extends AbstractProcess{
    private  OrderBl orderBl;
    private ClientBl clientBl;
    @Autowired
    public OrderProcessImpl(OrderBl orderBl,ClientBl clientBl){
        this.clientBl = clientBl;
        this.orderBl = orderBl;
        this.setName("Consultar Pedido actual");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        this.setStatus("STARTED");
    }
    private boolean hasShowOrder = false;
    @Override
    public AbstractProcess handle(ApplicationContext context, Update update, DeliveryLongPollingBot bot) {
        AbstractProcess result = this;
        Long chatId = update.getMessage().getChatId();
       // sigo en el mismo proceso.
        if (this.getStatus().equals("STARTED")) {

            showMenu(bot, chatId);
        } else if (this.getStatus().equals("AWAITING_USER_RESPONSE")) {
            // Estamos esperando por un numero 1 o 2
            Message message = update.getMessage();
            if ( message.hasText() ) {
                // Intentamos transformar en número
                String text = message.getText(); // El texto contiene asdasdas
                try {
                    int opcion = Integer.parseInt(text);
                    switch (opcion){
                        case 1 :
                            ClientDto clientDto = clientBl.getClientData(chatId);
                            if(clientDto != null){
                                UserSession.put(chatId,"nombre",clientDto.getNombre());
                                UserSession.put(chatId,"telefono",clientDto.getTelefono());
                                UserSession.put(chatId,"nit",clientDto.getNit());
                                result = context.getBean(OrderDataProcessImpl.class);
                            }
                            else{
                                result = context.getBean(NewClientDataProcessImpl.class);
                            }

                        break;
                        case 2 : result = context.getBean(MenuOrderProcessImpl.class);
                        break;

                        default: showMenu(bot, chatId); break;
                    }
                } catch (NumberFormatException ex) {
                    showMenu(bot, chatId);
                }
                // continuar con el proceso seleccionado
            } else { // Si me enviaron algo diferente de un texto.
                showMenu(bot, chatId);
            }
        }
        return result;

    }
    private void showMenu(DeliveryLongPollingBot bot, Long chatId){
        List<PlateInOrderDto> list = (List<PlateInOrderDto>) UserSession.get(chatId,"Lista");
        BigDecimal total = new BigDecimal(0.0) ,aux ;

        StringBuffer sb = new StringBuffer();
        sb.append("---Pedido---\r\n\n");
        for(PlateInOrderDto plate :list){
            aux = plate.getPlato().getPrecio();
            aux = aux.multiply(BigDecimal.valueOf(plate.getCantidad()));
            total = total.add(aux);
            sb.append(plate.toString());
            sb.append("\n\n");
        }
        sb.append("------------------------\n\r\n");
        sb.append("subtotal: ").append(total).append("Bs\n\r");
        sb.append("Envio: 10.00Bs\r\n");
        total = total.add(BigDecimal.valueOf(10));
        sb.append("Total: ").append(total).append("Bs\r\n");
        sendStringBuffer(bot,chatId,sb);
        sb.setLength(0);
        sb.append("Bot delivery\r\n");
        sb.append("1. Enviar Pedido\r\n");
        sb.append("2. Volver \r\n");
        sb.append("Elija una opción:\r\n");
        sendStringBuffer(bot, chatId, sb);

        this.setStatus("AWAITING_USER_RESPONSE");
    }
    @Override
    public AbstractProcess onError() {
        return null;
    }

    @Override
    public AbstractProcess onSuccess() {
        return null;
    }

    @Override
    public AbstractProcess onTimeout() {
        return null;
    }
}

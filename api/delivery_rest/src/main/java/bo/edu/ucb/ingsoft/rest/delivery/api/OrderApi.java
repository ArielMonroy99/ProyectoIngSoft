package bo.edu.ucb.ingsoft.rest.delivery.api;

import bo.edu.ucb.ingsoft.rest.delivery.bl.OrderBl;
import bo.edu.ucb.ingsoft.rest.delivery.dto.api.OrderApiDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/order")
public class OrderApi {
    private OrderBl orderBl;
    public static final Logger LOGGER = LoggerFactory.getLogger(OrderApi.class);


    public OrderApi(OrderBl orderBl) {
        this.orderBl = orderBl;
    }

    @PostMapping(path= "/{clientId}", consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE)
    public OrderApiDto saveClient(@RequestBody OrderApiDto order, @PathVariable Integer clientId ){
        LOGGER.info("ApiDto: {}",order.toString());
        return orderBl.createNewOrder(order,clientId);
    }

    @GetMapping(path = "/{orderId}",consumes = APPLICATION_JSON_VALUE,produces = APPLICATION_JSON_VALUE)
    public OrderApiDto getOrder(@PathVariable Integer orderId){
        LOGGER.info("ApiDto:{}",orderId);
        return orderBl.getOrderById(orderId);
    }
}

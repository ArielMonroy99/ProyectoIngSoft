package bo.edu.ucb.ingsoft.rest.delivery.dao;

import bo.edu.ucb.ingsoft.rest.delivery.dto.db.ClientDbDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

@Service
public interface ClientDao {
    @Select("Select cliente_id as client_id ,nombre,nit,telefono,usuario,password,correo, imagen,imagen_formato,imagen_nombre,status,tx_id," +
            "tx_host,tx_date from cliente where cliente_id = #{clientId}")
    ClientDbDto findClientById(@Param("clientId")Integer clientId);

    @Insert("Insert into cliente (cliente_id, nombre, nit, telefono, usuario, password , correo , imagen ,status )" +
            "values ( #{clientId},#{nombre},#{nit},#{telefono},#{usuario},#{password},#{correo},#{imagen},#{status});")
    void saveClient(ClientDbDto cliente);

    @Update("Update cliente set nombre = #{nombre},nit = #{nit},telefono =#{nit} ," +
            " correo = #{correo}, imagen = #{imagen} where cliente_id = #{clientId}")
    void updateClient(ClientDbDto cliente);

    @Update("Update cliente set imagen_nombre = #{imagen_nombre}, imagen = #{imagen}, imagen_formato = #{imagen_formato} where cliente_id = #{client_id}")
    void updatePhoto(@Param("imagen_nombre") String imageNombre,@Param("imagen") String imagen , @Param("imagen_formato") String imagenFormato, @Param("client_id")Integer clientId);
}

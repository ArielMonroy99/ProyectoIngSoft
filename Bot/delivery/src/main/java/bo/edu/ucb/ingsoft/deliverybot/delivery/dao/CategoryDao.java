package bo.edu.ucb.ingsoft.deliverybot.delivery.dao;

import bo.edu.ucb.ingsoft.deliverybot.delivery.dto.PlateDto;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface CategoryDao {

    @Select("select plato_id as id, nombre,precio,descripcion, imagen_url as img from plato where categoria_categoria_id = 1")
    List<PlateDto> findAllPlatesSoup();

    @Select("select plato_id as id, nombre,precio,descripcion, imagen_url as img from plato where categoria_categoria_id = 2")
    List<PlateDto> findAllPlatesMain();

    @Select("select plato_id as id, nombre,precio,descripcion, imagen_url as img from plato where categoria_categoria_id = 3")
    List<PlateDto> findAllPlatesDessert();

}

package bo.edu.ucb.ingsoft.rest.delivery.bl;

import bo.edu.ucb.ingsoft.rest.delivery.dao.PlateDao;
import bo.edu.ucb.ingsoft.rest.delivery.dao.SequenceDao;
import bo.edu.ucb.ingsoft.rest.delivery.dto.api.PlateApiDto;
import bo.edu.ucb.ingsoft.rest.delivery.dto.db.PlateDbDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class PlateBl {

    private PlateDao plateDao;
    private SequenceDao sequenceDao;
    public static final Logger LOGGER = LoggerFactory.getLogger(PlateBl.class);
    @Autowired
    public PlateBl(PlateDao plateDao, SequenceDao sequenceDao) {
        this.plateDao = plateDao;
        this.sequenceDao = sequenceDao;
    }





    public PlateApiDto findPlateById(Integer plateId){
        PlateDbDto plateDbDto = plateDao.findPlateById(plateId);
       LOGGER.info(plateDbDto.toString());
        PlateApiDto plateApiDto = new PlateApiDto();
        plateApiDto.setPlatoId(plateId);
        plateApiDto.setNombre(plateDbDto.getNombre());
        plateApiDto.setPrecio(plateDbDto.getPrecio());
        plateApiDto.setDescripcion(plateDbDto.getDescripcion());
        plateApiDto.setImagenUrl(plateDbDto.getImagenUrl());
        plateApiDto.setCategoriaCategoriaId(plateDbDto.getCategoriaCategoriaId());
        return plateApiDto;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public PlateDbDto creatNewPlate(PlateApiDto newClient){
        LOGGER.info("plato:{}",newClient.toString());
        PlateDbDto client = new PlateDbDto();
        client.setPlato_id(sequenceDao.getSequence(PlateDbDto.SEQUENCE_NAME));
        client.setNombre(newClient.getNombre());
        client.setPrecio(newClient.getPrecio());
        client.setDescripcion(newClient.getDescripcion());
        client.setImagenUrl(newClient.getImagenUrl());
        client.setCategoriaCategoriaId(newClient.getCategoriaCategoriaId());
        client.setStatus(1);
        client.setTxDate(new Date());
        client.setTxHost("localhost");
        client.setTxId(1);
        plateDao.addPlate(client);
        return client;

    }

    @Transactional(propagation = Propagation.REQUIRED)
    public PlateDbDto updatePlate(PlateApiDto newPlate , int plateId){
        PlateDbDto plate = new PlateDbDto();
        plate.setPlato_id(plateId);
        plate.setNombre(newPlate.getNombre());
        plate.setPrecio(newPlate.getPrecio());
        plate.setDescripcion(newPlate.getDescripcion());
        plate.setImagenUrl(newPlate.getImagenUrl());
        plate.setCategoriaCategoriaId(newPlate.getCategoriaCategoriaId());
        plate.setStatus(1);
        plate.setTxDate(new Date());
        plate.setTxHost("localhost");
        plate.setTxId(1);
        //logger.debug(plate.toString());
        plateDao.updatePlate(plate);
        return plate;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public PlateDbDto deletePlate(PlateApiDto deletPlate , int plateId){
        PlateDbDto plate = new PlateDbDto();
        plate.setPlato_id(plateId);

        plate.setStatus(0);

        plateDao.deletePlate(plate);
        return plate;
    }

    public List<PlateApiDto> findAllPlate(Integer categoryId){
        List<PlateApiDto> plateApiDto = plateDao.findAllPlate(categoryId);
        return plateApiDto;
    }

}

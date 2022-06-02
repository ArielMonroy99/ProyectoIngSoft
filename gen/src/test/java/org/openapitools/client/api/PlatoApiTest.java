/*
 * Delivery API
 * API para manejar pedidos y entrega de platos de un restaurant
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Plate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlatoApi
 */
@Ignore
public class PlatoApiTest {

    private final PlatoApi api = new PlatoApi();

    
    /**
     * Eliminar plato
     *
     * Elimina el plato 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void platePlateIdDeleteTest() throws ApiException {
        Integer plateId = null;
        Plate body = null;
        api.platePlateIdDelete(plateId, body);

        // TODO: test validations
    }
    
    /**
     * Obtener la informacion del plato
     *
     * Obtiene todos los datos registrados del plato 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void platePlateIdGetTest() throws ApiException {
        Integer plateId = null;
        Plate response = api.platePlateIdGet(plateId);

        // TODO: test validations
    }
    
    /**
     * Actualizar informacion del plato
     *
     * Actualiza los datos del plato 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void platePlateIdPutTest() throws ApiException {
        Integer plateId = null;
        Plate body = null;
        api.platePlateIdPut(plateId, body);

        // TODO: test validations
    }
    
    /**
     * Crea un nuevo plato
     *
     * Crea en nuevo pedido 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void platePostTest() throws ApiException {
        Plate body = null;
        api.platePost(body);

        // TODO: test validations
    }
    
}
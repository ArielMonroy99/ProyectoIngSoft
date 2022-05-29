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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Payment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-29T15:39:30.858963100-04:00[America/La_Paz]")
public class Payment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NRO = "nro";
  @SerializedName(SERIALIZED_NAME_NRO)
  private BigDecimal nro;

  public static final String SERIALIZED_NAME_VENC = "venc";
  @SerializedName(SERIALIZED_NAME_VENC)
  private String venc;

  public static final String SERIALIZED_NAME_NOMBRE = "nombre";
  @SerializedName(SERIALIZED_NAME_NOMBRE)
  private String nombre;


  public Payment id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Payment nro(BigDecimal nro) {
    
    this.nro = nro;
    return this;
  }

   /**
   * Get nro
   * @return nro
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1451320987987", value = "")

  public BigDecimal getNro() {
    return nro;
  }


  public void setNro(BigDecimal nro) {
    this.nro = nro;
  }


  public Payment venc(String venc) {
    
    this.venc = venc;
    return this;
  }

   /**
   * Get venc
   * @return venc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11/22", value = "")

  public String getVenc() {
    return venc;
  }


  public void setVenc(String venc) {
    this.venc = venc;
  }


  public Payment nombre(String nombre) {
    
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Pepe el mago", value = "")

  public String getNombre() {
    return nombre;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.id, payment.id) &&
        Objects.equals(this.nro, payment.nro) &&
        Objects.equals(this.venc, payment.venc) &&
        Objects.equals(this.nombre, payment.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nro, venc, nombre);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nro: ").append(toIndentedString(nro)).append("\n");
    sb.append("    venc: ").append(toIndentedString(venc)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


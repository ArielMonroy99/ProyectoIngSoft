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
 * OrderPlatos
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-29T15:39:30.858963100-04:00[America/La_Paz]")
public class OrderPlatos {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NOMBRE = "nombre";
  @SerializedName(SERIALIZED_NAME_NOMBRE)
  private BigDecimal nombre;

  public static final String SERIALIZED_NAME_DESCRIPCION = "descripcion";
  @SerializedName(SERIALIZED_NAME_DESCRIPCION)
  private String descripcion;

  public static final String SERIALIZED_NAME_PRECIO = "precio";
  @SerializedName(SERIALIZED_NAME_PRECIO)
  private BigDecimal precio;

  public static final String SERIALIZED_NAME_CANTIDAD = "cantidad";
  @SerializedName(SERIALIZED_NAME_CANTIDAD)
  private Integer cantidad;

  public static final String SERIALIZED_NAME_NOTA = "nota";
  @SerializedName(SERIALIZED_NAME_NOTA)
  private String nota;

  public static final String SERIALIZED_NAME_IMG = "img";
  @SerializedName(SERIALIZED_NAME_IMG)
  private String img;


  public OrderPlatos id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public OrderPlatos nombre(BigDecimal nombre) {
    
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getNombre() {
    return nombre;
  }


  public void setNombre(BigDecimal nombre) {
    this.nombre = nombre;
  }


  public OrderPlatos descripcion(String descripcion) {
    
    this.descripcion = descripcion;
    return this;
  }

   /**
   * Get descripcion
   * @return descripcion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Algo de texto aqui", value = "")

  public String getDescripcion() {
    return descripcion;
  }


  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }


  public OrderPlatos precio(BigDecimal precio) {
    
    this.precio = precio;
    return this;
  }

   /**
   * Get precio
   * @return precio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30.0", value = "")

  public BigDecimal getPrecio() {
    return precio;
  }


  public void setPrecio(BigDecimal precio) {
    this.precio = precio;
  }


  public OrderPlatos cantidad(Integer cantidad) {
    
    this.cantidad = cantidad;
    return this;
  }

   /**
   * Get cantidad
   * @return cantidad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getCantidad() {
    return cantidad;
  }


  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }


  public OrderPlatos nota(String nota) {
    
    this.nota = nota;
    return this;
  }

   /**
   * Get nota
   * @return nota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sin pollo", value = "")

  public String getNota() {
    return nota;
  }


  public void setNota(String nota) {
    this.nota = nota;
  }


  public OrderPlatos img(String img) {
    
    this.img = img;
    return this;
  }

   /**
   * Get img
   * @return img
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://img_dela_mila.jpg", value = "")

  public String getImg() {
    return img;
  }


  public void setImg(String img) {
    this.img = img;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPlatos orderPlatos = (OrderPlatos) o;
    return Objects.equals(this.id, orderPlatos.id) &&
        Objects.equals(this.nombre, orderPlatos.nombre) &&
        Objects.equals(this.descripcion, orderPlatos.descripcion) &&
        Objects.equals(this.precio, orderPlatos.precio) &&
        Objects.equals(this.cantidad, orderPlatos.cantidad) &&
        Objects.equals(this.nota, orderPlatos.nota) &&
        Objects.equals(this.img, orderPlatos.img);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, descripcion, precio, cantidad, nota, img);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPlatos {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    precio: ").append(toIndentedString(precio)).append("\n");
    sb.append("    cantidad: ").append(toIndentedString(cantidad)).append("\n");
    sb.append("    nota: ").append(toIndentedString(nota)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
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


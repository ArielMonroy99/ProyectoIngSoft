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
 * Plate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-29T15:39:30.858963100-04:00[America/La_Paz]")
public class Plate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NOMBRE = "nombre";
  @SerializedName(SERIALIZED_NAME_NOMBRE)
  private String nombre;

  public static final String SERIALIZED_NAME_PRECIO = "precio";
  @SerializedName(SERIALIZED_NAME_PRECIO)
  private BigDecimal precio;

  public static final String SERIALIZED_NAME_DESCRIPCION = "descripcion";
  @SerializedName(SERIALIZED_NAME_DESCRIPCION)
  private String descripcion;

  public static final String SERIALIZED_NAME_IMAGEN = "imagen";
  @SerializedName(SERIALIZED_NAME_IMAGEN)
  private String imagen;

  public static final String SERIALIZED_NAME_CATEGORIA = "categoria";
  @SerializedName(SERIALIZED_NAME_CATEGORIA)
  private Integer categoria;


  public Plate id(Integer id) {
    
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


  public Plate nombre(String nombre) {
    
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Milanesa", value = "")

  public String getNombre() {
    return nombre;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  public Plate precio(BigDecimal precio) {
    
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


  public Plate descripcion(String descripcion) {
    
    this.descripcion = descripcion;
    return this;
  }

   /**
   * Get descripcion
   * @return descripcion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Rico plato", value = "")

  public String getDescripcion() {
    return descripcion;
  }


  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }


  public Plate imagen(String imagen) {
    
    this.imagen = imagen;
    return this;
  }

   /**
   * Get imagen
   * @return imagen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "img.png", value = "")

  public String getImagen() {
    return imagen;
  }


  public void setImagen(String imagen) {
    this.imagen = imagen;
  }


  public Plate categoria(Integer categoria) {
    
    this.categoria = categoria;
    return this;
  }

   /**
   * Get categoria
   * @return categoria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getCategoria() {
    return categoria;
  }


  public void setCategoria(Integer categoria) {
    this.categoria = categoria;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plate plate = (Plate) o;
    return Objects.equals(this.id, plate.id) &&
        Objects.equals(this.nombre, plate.nombre) &&
        Objects.equals(this.precio, plate.precio) &&
        Objects.equals(this.descripcion, plate.descripcion) &&
        Objects.equals(this.imagen, plate.imagen) &&
        Objects.equals(this.categoria, plate.categoria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, precio, descripcion, imagen, categoria);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    precio: ").append(toIndentedString(precio)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    imagen: ").append(toIndentedString(imagen)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
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

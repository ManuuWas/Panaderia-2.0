package com.panaderia.model;

import jakarta.persistence.*;

@Entity
public class Producto {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;

 private String nombre;
 private String descripcion;
 private Double precio;
 private Integer cantidadDisponible;

 @ManyToOne
 private Categoria categoria;

 public Long getId(){return id;}
 public String getNombre(){return nombre;}
 public void setNombre(String n){nombre=n;}
 public String getDescripcion(){return descripcion;}
 public void setDescripcion(String d){descripcion=d;}
 public Double getPrecio(){return precio;}
 public void setPrecio(Double p){precio=p;}
 public Integer getCantidadDisponible(){return cantidadDisponible;}
 public void setCantidadDisponible(Integer c){cantidadDisponible=c;}
}
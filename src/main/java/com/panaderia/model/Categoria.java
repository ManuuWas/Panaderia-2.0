package com.panaderia.model;

import jakarta.persistence.*;

@Entity
public class Categoria {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String nombre;
 private String descripcion;

 public Long getId(){return id;}
 public String getNombre(){return nombre;}
 public void setNombre(String n){nombre=n;}
 public String getDescripcion(){return descripcion;}
 public void setDescripcion(String d){descripcion=d;}
}
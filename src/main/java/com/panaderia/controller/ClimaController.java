package com.panaderia.controller;

import com.panaderia.service.ClimaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clima")
public class ClimaController {

 private final ClimaService servicio;

 public ClimaController(ClimaService servicio){
  this.servicio=servicio;
 }

 @GetMapping
 public String clima(){
  return servicio.consultarClima();
 }
}
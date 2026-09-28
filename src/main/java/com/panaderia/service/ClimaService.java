package com.panaderia.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClimaService {

 public String consultarClima(){
  try{
   RestTemplate rest=new RestTemplate();
   return rest.getForObject(
   "https://api.open-meteo.com/v1/forecast?latitude=4.71&longitude=-74.07&current_weather=true",
   String.class);
  }catch(Exception e){
   return "No fue posible consultar el clima";
  }
 }
}
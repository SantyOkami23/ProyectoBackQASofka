package com.sofkau.qa.terminalpolombia.controller;


import com.sofkau.qa.terminalpolombia.models.RutaBus;
import com.sofkau.qa.terminalpolombia.service.InterfaceBoletosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/compras")
public class BoletoBusController {

    @Autowired
    private InterfaceBoletosService service;


    @GetMapping()
    public ResponseEntity obtenerBoletos(){
        return new ResponseEntity(service.obtenerBoletos(), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity registrarCompra(@RequestBody List<RutaBus> rutaBuses){
        service.registrarCompraBoleto(rutaBuses);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}

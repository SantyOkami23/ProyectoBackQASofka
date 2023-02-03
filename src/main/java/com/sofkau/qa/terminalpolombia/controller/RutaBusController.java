package com.sofkau.qa.terminalpolombia.controller;
import com.sofkau.qa.terminalpolombia.models.RutaBus;
import com.sofkau.qa.terminalpolombia.service.InterfaceRutaBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest")
public class RutaBusController {

    @Autowired
    private InterfaceRutaBusService RutaBusService;

    @GetMapping("/mostrar/all")
    public ResponseEntity GETtraerRutaBus(){

        return new ResponseEntity(RutaBusService.obtenerRutasDisponibles() ,HttpStatus.FOUND);
    }

    @PostMapping()
    public ResponseEntity listaRutaBus(@RequestBody RutaBus rutaBus) {
        return new ResponseEntity(RutaBusService.agregarRutaBus(rutaBus), HttpStatus.CREATED);
    }
//Prueba
}
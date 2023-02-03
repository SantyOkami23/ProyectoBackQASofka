package com.sofkau.qa.terminalpolombia.service;

import com.sofkau.qa.terminalpolombia.models.RutaBus;

import java.util.List;

public interface InterfaceRutaBusService {

    List<RutaBus> obtenerRutasDisponibles();
    RutaBus agregarRutaBus(RutaBus rutaBus);

}

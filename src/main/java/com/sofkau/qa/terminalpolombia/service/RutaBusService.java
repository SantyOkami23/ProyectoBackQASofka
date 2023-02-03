package com.sofkau.qa.terminalpolombia.service;

import com.sofkau.qa.terminalpolombia.models.RutaBus;
import com.sofkau.qa.terminalpolombia.repository.TerminalPolombia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RutaBusService implements InterfaceRutaBusService {

    @Autowired
    private TerminalPolombia terminalPolombia;
    @Override
    public List<RutaBus> obtenerRutasDisponibles() {
        return terminalPolombia.getRutaBus();
    }

    @Override
    public RutaBus agregarRutaBus(RutaBus rutaBus) {
        RutaBus rutaBusInventario = new RutaBus(UUID.randomUUID().toString(),
                rutaBus.getNombreRuta(),
                rutaBus.getTotalAsientosDisponibles(),
                rutaBus.getPrecioBoleto(),
                rutaBus.getHorario(),
                rutaBus.getNombreUsuario(),
                rutaBus.getEdad(),
                rutaBus.getCedula());

        terminalPolombia.agregarRuta(rutaBusInventario);
        return rutaBusInventario;
    }



}

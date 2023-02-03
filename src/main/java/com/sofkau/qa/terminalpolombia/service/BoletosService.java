package com.sofkau.qa.terminalpolombia.service;

import com.sofkau.qa.terminalpolombia.repository.BoletoRepository;
import com.sofkau.qa.terminalpolombia.repository.TerminalPolombia;
import com.sofkau.qa.terminalpolombia.models.BoletoBus;
import com.sofkau.qa.terminalpolombia.models.RutaBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class BoletosService implements InterfaceBoletosService {

    @Autowired
    private BoletoRepository boletoRepository;

    @Autowired
    private TerminalPolombia terminalPolombia;
    @Override
    public void registrarCompraBoleto(List<RutaBus> boletosComprados) {
        BoletoBus nuevaBoletoBus = new BoletoBus(UUID.randomUUID().toString(), new Date().toString());
        nuevaBoletoBus.setRutaBuses(boletosComprados);
        boletosComprados.stream().forEach(rutaBus -> {
            terminalPolombia.disminuirAsientos(rutaBus.getId());
        });
        boletoRepository.registrarVenta(nuevaBoletoBus);
    }

    @Override
    public List<BoletoBus> obtenerBoletos() {
        return boletoRepository.obtenerBoletos();
    }
}

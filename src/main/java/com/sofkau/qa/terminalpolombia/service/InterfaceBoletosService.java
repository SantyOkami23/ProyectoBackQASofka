package com.sofkau.qa.terminalpolombia.service;

import com.sofkau.qa.terminalpolombia.models.BoletoBus;
import com.sofkau.qa.terminalpolombia.models.RutaBus;

import java.util.List;

public interface InterfaceBoletosService {

    void registrarCompraBoleto(List<RutaBus> boletosVendidos);

    List<BoletoBus> obtenerBoletos();
}

package com.sofkau.qa.terminalpolombia.repository;


import com.sofkau.qa.terminalpolombia.models.BoletoBus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoletoRepository {

    private List<BoletoBus> boletoBuses;

    public BoletoRepository(){
        this.boletoBuses = new ArrayList<>();
    }

    public List<BoletoBus> obtenerBoletos(){
        return this.boletoBuses;
    }

    public void registrarVenta(BoletoBus boletoBus){
        boletoBuses.add(boletoBus);
    }
}

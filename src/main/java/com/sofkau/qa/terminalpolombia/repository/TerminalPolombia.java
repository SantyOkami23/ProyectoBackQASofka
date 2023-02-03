package com.sofkau.qa.terminalpolombia.repository;

import com.sofkau.qa.terminalpolombia.models.RutaBus;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class TerminalPolombia {
     private final String nombre;
     private List<RutaBus> rutaBuses;

     private int precioProducto;
     private  String totalAsientosDisponibles;
     private String nombreRuta;
     private int precioBoleto;
     private int horario;
     private String Apellido;
     private int edad;
     private int cedula;

    public TerminalPolombia() {
        this.nombre = "Terminal Polombia";
        rutaBuses = new ArrayList<>(List.of(new RutaBus("1", "RUTA 17 A", 10, 3000, " 5 de la tarde", "", "", 0),
                new RutaBus("2", "RUTA 18 ", 10, 3000, " 4 de la tarde", "", "", 0)



                //Aqui agrego mas rutas
              ));
    }


    @Override
    public String toString() {

        return "TerminalPolombia {" +
                "nombreRuta='" + nombreRuta + '\'' +
                ",totalAsientosDisponibles=" + totalAsientosDisponibles +
                ", precioBoleto=" + precioBoleto +
                ", horario=" + horario +
                ", Apellido=" + Apellido +
                ", edad=" + edad +
                ", cedula=" + cedula +
                '}';
    }

    public void disminuirAsientos(String id){
        List<RutaBus> resultado = rutaBuses.stream().map(producto -> {
            if(producto.getId().equals(id)){
                producto.disminuirAsientos();
                return producto;
            }
            return producto;
        }).collect(Collectors.toList());
    }


    public void agregarRuta(RutaBus rutaBus) {
        rutaBuses.add(rutaBus);
    }


    public List<RutaBus> getRutaBus() {
        return rutaBuses;
    }

    public void setRutaBus(List<RutaBus> rutaBuses) {
        this.rutaBuses = rutaBuses;
    }


}


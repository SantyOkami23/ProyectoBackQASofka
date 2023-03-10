package com.sofkau.qa.terminalpolombia.models;

public class RutaBus {
    private String id;
    private String nombreRuta;
    private int totalAsientosDisponibles;
    private int precioBoleto;

    private String horario;


    //Datos de usuario

    private String nombreUsuario;
    private String edad;
    private int cedula;




    public RutaBus(String id, String nombreRuta, int totalAsientosDisponibles, int precioBoleto, String horario, String nombreUsuario, String edad, int cedula) {
        this.id = id;
        this.nombreRuta = nombreRuta;
        this.totalAsientosDisponibles = totalAsientosDisponibles;
        this.precioBoleto = precioBoleto;
        this.horario = horario;
        this.nombreUsuario = nombreUsuario;
        this.edad = edad;
        this.cedula = cedula;
    }

    public void disminuirAsientos(){
        this.totalAsientosDisponibles--;
    }


    public String getNombreRuta() {
        return nombreRuta;
    }



    public int getTotalAsientosDisponibles() {
        return totalAsientosDisponibles;
    }


    public int getPrecioBoleto() {
        return precioBoleto;
    }

    public String getId() {
        return id;
    }

    public String getHorario() {
        return horario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEdad() {
        return edad;
    }

    public int getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreRuta='" + nombreRuta + '\'' +
                ",totalAsientosDisponibles=" + totalAsientosDisponibles +
                ", precioBoleto=" + precioBoleto +
                ", horario=" + horario +
                ", nombreUsuario=" + nombreUsuario +
                ", edad=" + edad +
                ", cedula=" + cedula +
                '}';
    }


}

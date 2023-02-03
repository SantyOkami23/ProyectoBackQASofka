package com.sofkau.qa.terminalpolombia.models;

import java.util.ArrayList;
import java.util.List;

public class BoletoBus {

    private String id;
    private String date;
    private List<RutaBus> rutaBuses;

    public BoletoBus(String id, String date){
        this.id = id;
        this.date = date;
        this.rutaBuses = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<RutaBus> getRutaBus() {
        return rutaBuses;
    }

    public void setRutaBuses(List<RutaBus> rutaBuses) {
        this.rutaBuses = rutaBuses;
    }
}

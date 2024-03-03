package com.m5a.complexivo_user_card.models;

import lombok.Data;

@Data
public class Ciudad {
    private String codigoCiudad;
    private String nombreCiudad;

    public Ciudad(String codigoCiudad, String nombreCiudad) {
        super();
        this.codigoCiudad = codigoCiudad;
        this.nombreCiudad = nombreCiudad;
    }
}
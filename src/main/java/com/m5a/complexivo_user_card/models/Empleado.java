package com.m5a.complexivo_user_card.models;

import lombok.Data;

@Data
public class Empleado {
    private String nombre;
    private String apellido;
    private String ciudad;
    private String sucursal;

    public Empleado(String nombre, String apellido, String ciudad, String sucursal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.sucursal = sucursal;
    }
}
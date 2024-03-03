package com.m5a.complexivo_user_card.models;


import lombok.Data;

@Data
public class Sucursal {
    private String codigoCiudad;
    private String codigoSucursal;
    private String nombreSucursal;

	public Sucursal(String codigoCiudad, String codigoSucursal, String nombreSucursal) {
		this.codigoCiudad = codigoCiudad;
		this.codigoSucursal = codigoSucursal;
		this.nombreSucursal = nombreSucursal;
	}
}

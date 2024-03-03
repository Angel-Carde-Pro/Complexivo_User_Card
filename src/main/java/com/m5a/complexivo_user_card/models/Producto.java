package com.m5a.complexivo_user_card.models;


import lombok.Data;

@Data
public class Producto {
    private Double precio;
    private String nombre;

	public Producto(Double precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
	}
}
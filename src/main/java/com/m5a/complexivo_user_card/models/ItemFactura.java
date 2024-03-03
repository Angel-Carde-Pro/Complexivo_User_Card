package com.m5a.complexivo_user_card.models;

import lombok.Data;

@Data
public class ItemFactura {
    private Producto producto;
    private Integer cantidad;

    public ItemFactura(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
}
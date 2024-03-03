package com.m5a.complexivo_user_card.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class Factura {
    @Value("${factura.descripcion}")
    private String descripcion;
    @Autowired
    private Cliente cliente;
    @Autowired
    private List<ItemFactura> items;
}

package com.m5a.complexivo_user_card.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "vcard")
public class VCardProperties {
    @Autowired
    private List<Ciudad> ciudades;
    @Autowired
    private List<Sucursal> sucursales;
    @Autowired
    private List<Empleado> empleados;
}

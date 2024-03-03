package com.m5a.complexivo_user_card.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cliente {


    @Value("Ange Steven")
    private String nombre;

    @Value("Cardenas Cardenas")
    private String apellido;
}

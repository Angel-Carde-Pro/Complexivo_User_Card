package com.m5a.complexivo_user_card;

import com.m5a.complexivo_user_card.models.*;
import com.m5a.complexivo_user_card.service.Iservice;
import com.m5a.complexivo_user_card.service.Miservice;
import com.m5a.complexivo_user_card.service.MiserviceComplej;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean("miServicioSimple")
    public Iservice registrasMiservicio() {
        return new Miservice();
    }

    @Bean("miServicioComplejo")
    @Primary
    public Iservice registrasMiservicioComplejo() {
        return new MiserviceComplej();
    }

    @Bean
    public Producto producto1() {
        return new Producto(1.0, "Cebolla");
    }

    @Bean
    public Producto producto2() {
        return new Producto(5.0, "Papas");
    }

    @Bean
    public Producto producto3() {
        return new Producto(3.0, "Helado de Crema");
    }

    @Bean
    public Producto producto4() {
        return new Producto(1.0, "Cafe");
    }

    @Bean
    public Producto producto5() {
        return new Producto(3.0, "Aceite");
    }

    @Bean
    public Producto producto6() {
        return new Producto(50.0, "Arroz");
    }

    @Bean
    public Ciudad ciudad1() {
        return new Ciudad("C1", "Cuenca");
    }

    @Bean
    public Ciudad ciudad2() {
        return new Ciudad("C2", "Quito");
    }

    @Bean
    public Sucursal sucursal1(Ciudad ciudad1) {
        return new Sucursal(ciudad1.getCodigoCiudad(), "S1", "Sucursal 1");
    }

    @Bean
    public Sucursal sucursal2(Ciudad ciudad2) {
        return new Sucursal(ciudad2.getCodigoCiudad(), "S2", "Sucursal 2");
    }

    // Bean para Empleado
    @Bean
    public Empleado empleado1(Ciudad ciudad1, Sucursal sucursal1) {
        return new Empleado("Vanessa", "Sanchez", ciudad1.getNombreCiudad(), sucursal1.getNombreSucursal());
    }

    @Bean
    public Empleado empleado2(Ciudad ciudad2, Sucursal sucursal2) {
        return new Empleado("David", "Mendieta", ciudad2.getNombreCiudad(), sucursal2.getNombreSucursal());
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(Producto producto1, Producto producto2, Producto producto3, Producto producto4, Producto producto5, Producto producto6) {
        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);
        ItemFactura linea3 = new ItemFactura(producto3, 5);
        ItemFactura linea4 = new ItemFactura(producto4, 6);
        ItemFactura linea5 = new ItemFactura(producto5, 7);
        ItemFactura linea6 = new ItemFactura(producto6, 8);
        return Arrays.asList(linea1, linea2, linea3, linea4, linea5, linea6);
    }
}
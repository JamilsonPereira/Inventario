package br.com.jptech.inventario.core.domain;

import lombok.Data;

@Data
public class Address {

    private String street;
    private String number;
    private String complement;
    private String city;
    private String state;
    private String zipCode;
}

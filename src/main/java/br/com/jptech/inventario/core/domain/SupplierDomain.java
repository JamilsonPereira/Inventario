package br.com.jptech.inventario.core.domain;

import lombok.Data;

@Data
public class SupplierDomain {

    private String name;
    private String email;
    private String telefone;
    private String employerIdentificationNumber;
    private Address address;
}

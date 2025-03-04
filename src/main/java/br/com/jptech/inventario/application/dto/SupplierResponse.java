package br.com.jptech.inventario.application.dto;

import lombok.Data;

import java.util.List;

@Data
public class SupplierResponse {
    private String id;
    private String name;
    private String email;
    private String phone;
    private List<String> productList;
    private int deadlineDelivery;
    private double price;
    private int stockAvailable;

}

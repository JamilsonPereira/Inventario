package br.com.jptech.inventario.core.domain;

import lombok.Data;

@Data
public class ProductDomain {
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private String image;
    private String category;
    private String supplier;
    private String code;
}

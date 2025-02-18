package br.com.jptech.inventario.core.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDomain {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private String image;
    private String category;
    private String supplier;
    private String code;
}

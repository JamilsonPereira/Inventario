package br.com.jptech.inventario.core.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

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

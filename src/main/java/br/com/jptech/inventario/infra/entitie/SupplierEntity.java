package br.com.jptech.inventario.infra.entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "supplier")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private List<String> productList;
    @Column
    private int deadlineDelivery; // in days
    @Column
    private double price;
    @Column
    private int stockAvailable;
}

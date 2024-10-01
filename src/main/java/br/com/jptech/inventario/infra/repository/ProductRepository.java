package br.com.jptech.inventario.infra.repository;

import br.com.jptech.inventario.infra.entitie.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}

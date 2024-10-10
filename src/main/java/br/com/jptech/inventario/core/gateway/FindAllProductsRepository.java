package br.com.jptech.inventario.core.gateway;

import br.com.jptech.inventario.core.domain.ProductDomain;

import java.util.List;

public interface FindAllProductsRepository {

    List<ProductDomain> findAllProducts();
}

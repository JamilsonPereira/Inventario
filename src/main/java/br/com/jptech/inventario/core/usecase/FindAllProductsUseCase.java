package br.com.jptech.inventario.core.usecase;

import br.com.jptech.inventario.core.domain.ProductDomain;

import java.util.List;

public interface FindAllProductsUseCase {
    List<ProductDomain> findAllProducts();
}

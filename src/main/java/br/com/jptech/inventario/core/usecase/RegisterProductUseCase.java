package br.com.jptech.inventario.core.usecase;

import br.com.jptech.inventario.core.domain.ProductDomain;

public interface RegisterProductUseCase {
    ProductDomain saveProduct(ProductDomain product);
}

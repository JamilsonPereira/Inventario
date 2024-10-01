package br.com.jptech.inventario.core.gateway;

import br.com.jptech.inventario.core.domain.ProductDomain;

public interface RegisterProductRepository {

    ProductDomain save(ProductDomain productDomain);
}

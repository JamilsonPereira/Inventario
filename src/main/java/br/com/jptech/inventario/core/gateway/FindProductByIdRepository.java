package br.com.jptech.inventario.core.gateway;

import br.com.jptech.inventario.core.domain.ProductDomain;

public interface FindProductByIdRepository {

    ProductDomain findById(Long id);
}

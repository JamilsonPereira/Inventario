package br.com.jptech.inventario.core.gateway;

import br.com.jptech.inventario.core.domain.ProductDomain;

public interface PatchProductRepository {

    void patchProduct(ProductDomain productDomain, Long id);
}

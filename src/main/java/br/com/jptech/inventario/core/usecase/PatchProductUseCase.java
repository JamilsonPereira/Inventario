package br.com.jptech.inventario.core.usecase;

import br.com.jptech.inventario.core.domain.ProductDomain;

public interface PatchProductUseCase {

    void patchProduct(ProductDomain productDomain, Long id);
}

package br.com.jptech.inventario.core.usecase;

import br.com.jptech.inventario.core.domain.ProductDomain;

public interface FindProductByIdUseCase {

    ProductDomain findById(Long id);
}

package br.com.jptech.inventario.core.usecase.impl;

import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.core.gateway.FindAllProductsRepository;
import br.com.jptech.inventario.core.usecase.FindAllProductsUseCase;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class FindAllProductsUseCaseImpl implements FindAllProductsUseCase {

    private FindAllProductsRepository findAllProductsRepository;

    @Override
    public List<ProductDomain> findAllProducts() {
        return findAllProductsRepository.findAllProducts();
    }
}
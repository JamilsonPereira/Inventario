package br.com.jptech.inventario.core.usecase.impl;

import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.core.gateway.FindProductByIdRepository;
import br.com.jptech.inventario.core.usecase.FindProductByIdUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindProductByIdUseCaseImpl implements FindProductByIdUseCase {
    private FindProductByIdRepository findProductByIdRepository;

    @Override
    public ProductDomain findById(Long id) {
        return findProductByIdRepository.findById(id);
    }
}

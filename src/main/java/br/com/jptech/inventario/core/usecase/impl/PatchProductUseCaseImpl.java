package br.com.jptech.inventario.core.usecase.impl;

import br.com.jptech.inventario.application.mapper.ProductMapper;
import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.core.gateway.FindProductByIdRepository;
import br.com.jptech.inventario.core.gateway.PatchProductRepository;
import br.com.jptech.inventario.core.usecase.PatchProductUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PatchProductUseCaseImpl implements PatchProductUseCase {

    PatchProductRepository patchProductRepository;
    FindProductByIdRepository findProductByIdRepository;

    @Override
    public void patchProduct(ProductDomain productDomain , Long id) {

        patchProductRepository.patchProduct(productDomain, id);
    }
}

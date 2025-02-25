package br.com.jptech.inventario.core.usecase.impl;


import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.core.gateway.FindProductByIdRepository;
import br.com.jptech.inventario.core.gateway.RegisterProductRepository;
import br.com.jptech.inventario.core.usecase.RegisterProductUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@AllArgsConstructor
@Slf4j
public class RegisterProductUseCaseImpl implements RegisterProductUseCase {

    private final RegisterProductRepository registerProductRepository;
    private final FindProductByIdRepository findProductByIdUseCase;

    @Override
    public ProductDomain saveProduct(ProductDomain product) {

        if (findProduct(product).isPresent()){

                log.info("Produto Já existe" + product.getId());
        }

        return registerProductRepository.save(product);
    }

    private Optional<ProductDomain> findProduct(ProductDomain product) {
        return Optional.ofNullable(findProductByIdUseCase.findById(product.getId()));
    }
}

package br.com.jptech.inventario.core.usecase.impl;


import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.core.gateway.RegisterProductRepository;
import br.com.jptech.inventario.core.usecase.RegisterProductUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
public class RegisterProductUseCaseImpl implements RegisterProductUseCase {

    private RegisterProductRepository registerProductRepository;

    @Override
    public ProductDomain saveProduct(ProductDomain product) {
        System.out.println("Product: " + product);
        return registerProductRepository.save(product);
    }
}

package br.com.jptech.inventario.infra.config;

import br.com.jptech.inventario.application.mapper.ProductMapper;
import br.com.jptech.inventario.core.gateway.*;
import br.com.jptech.inventario.core.usecase.*;
import br.com.jptech.inventario.core.usecase.impl.*;
import br.com.jptech.inventario.infra.persistence.*;
import br.com.jptech.inventario.infra.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    public RegisterProductUseCase registerProductUseCase(RegisterProductRepository registerProductRepository, FindProductByIdRepository findProductByIdRepository) {
        return new RegisterProductUseCaseImpl(registerProductRepository, findProductByIdRepository);
    }

    @Bean

    public RegisterProductRepository registerProductRepository(ProductRepository productRepository, ProductMapper productMapper) {
        return new RegisterProductRepositoryImpl(productRepository, productMapper);
    }

    @Bean
    public FindAllProductsUseCase findAllProductsUseCase(FindAllProductsRepository findAllProductsRepository) {
        return new FindAllProductsUseCaseImpl(findAllProductsRepository);
    }

    @Bean
    public FindAllProductsRepository findAllProductsRepository(ProductRepository productRepository, ProductMapper productMapper) {
        return new FindAllProductsRepositoryImpl(productRepository, productMapper);
    }

    @Bean
    public FindProductByIdUseCase findProductByIdUseCase(FindProductByIdRepository findProductByIdRepository) {
        return new FindProductByIdUseCaseImpl(findProductByIdRepository);
    }

    @Bean
    public FindProductByIdRepository findProductByIdRepository(ProductRepository productRepository, ProductMapper productMapper) {
        return new FindProductByIdRepositoryImpl(productRepository, productMapper);
    }

    @Bean
    public DeleteProductUseCase deleteProductUseCase(DeleteProductByIDRepository deleteProductByIDRepository) {
        return  new DeleteProductUseCaseImpl(deleteProductByIDRepository);
    }

    @Bean
    public DeleteProductByIDRepository deleteProductRepository(ProductRepository productRepository) {
        return new DeleteProductByIdByIDRepositoryImpl(productRepository);
    }


   @Bean
    public PatchProductUseCase patchProductUseCase(PatchProductRepository patchProductRepository, FindProductByIdRepository findProductByIdRepository) {
        return new PatchProductUseCaseImpl(patchProductRepository, findProductByIdRepository);
    }

    @Bean
    public PatchProductRepository patchProductRepository(ProductRepository productRepository, ProductMapper productMapper) {
        return new PatchProductRepositoryImpl(productRepository, productMapper);
    }
}

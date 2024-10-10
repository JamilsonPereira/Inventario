package br.com.jptech.inventario.infra.config;

import br.com.jptech.inventario.application.mapper.ProductMapper;
import br.com.jptech.inventario.core.gateway.DeleteProductByIDRepository;
import br.com.jptech.inventario.core.gateway.FindAllProductsRepository;
import br.com.jptech.inventario.core.gateway.FindProductByIdRepository;
import br.com.jptech.inventario.core.gateway.RegisterProductRepository;
import br.com.jptech.inventario.core.usecase.DeleteProductUseCase;
import br.com.jptech.inventario.core.usecase.FindAllProductsUseCase;
import br.com.jptech.inventario.core.usecase.FindProductByIdUseCase;
import br.com.jptech.inventario.core.usecase.RegisterProductUseCase;
import br.com.jptech.inventario.core.usecase.impl.DeleteProductUseCaseImpl;
import br.com.jptech.inventario.core.usecase.impl.FindAllProductsUseCaseImpl;
import br.com.jptech.inventario.core.usecase.impl.FindProductByIdUseCaseImpl;
import br.com.jptech.inventario.core.usecase.impl.RegisterProductUseCaseImpl;
import br.com.jptech.inventario.infra.persistence.DeleteProductByIdByIDRepositoryImpl;
import br.com.jptech.inventario.infra.persistence.FindAllProductsRepositoryImpl;
import br.com.jptech.inventario.infra.persistence.FindProductByIdRepositoryImpl;
import br.com.jptech.inventario.infra.persistence.RegisterProductRepositoryImpl;
import br.com.jptech.inventario.infra.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    public RegisterProductUseCase registerProductUseCase(RegisterProductRepository registerProductRepository) {
        return new RegisterProductUseCaseImpl(registerProductRepository);
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
}

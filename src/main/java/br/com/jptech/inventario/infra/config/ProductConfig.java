package br.com.jptech.inventario.infra.config;

import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.core.gateway.RegisterProductRepository;
import br.com.jptech.inventario.core.usecase.RegisterProductUseCase;
import br.com.jptech.inventario.core.usecase.impl.RegisterProductUseCaseImpl;
import br.com.jptech.inventario.infra.persistence.RegisterProductRepositoryImpl;
import br.com.jptech.inventario.infra.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Autowired
    private  RegisterProductRepository registerProductRepository;
    @Autowired
    private ProductRepository productRepository;


//    @Bean
//    public RegisterProductRepositoryImpl registerProductService(ProductRepository productRepository) {
//        return new RegisterProductRepositoryImpl(productRepository);
//    }

    @Bean
    public  RegisterProductUseCase registerProductUseCase(RegisterProductRepository registerProductRepository) {
        return new RegisterProductUseCaseImpl(registerProductRepository);
    }
}

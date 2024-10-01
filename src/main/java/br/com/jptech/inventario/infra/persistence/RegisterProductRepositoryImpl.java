package br.com.jptech.inventario.infra.persistence;

import br.com.jptech.inventario.application.mapper.ProductMapper;
import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.core.gateway.RegisterProductRepository;
import br.com.jptech.inventario.core.usecase.RegisterProductUseCase;
import br.com.jptech.inventario.infra.entitie.ProductEntity;
import br.com.jptech.inventario.infra.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RegisterProductRepositoryImpl implements RegisterProductRepository {

    @Autowired
    private final ProductRepository productRepository;

    @Autowired
    private final ProductMapper productMapper;

    @Autowired
    private RegisterProductUseCase registerProductUseCase;

    @Override
    public ProductDomain save(ProductDomain productDomain) {

        ProductEntity productEntity = productRepository.save(productMapper.productDomainToProductEntity((productDomain)));
        return productMapper.productEntityToProduct(productEntity);
    }
}
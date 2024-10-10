package br.com.jptech.inventario.infra.persistence;

import br.com.jptech.inventario.application.mapper.ProductMapper;
import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.core.gateway.FindAllProductsRepository;
import br.com.jptech.inventario.infra.repository.ProductRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class FindAllProductsRepositoryImpl implements FindAllProductsRepository {
    private ProductRepository productRepository;

    private ProductMapper productMapper;
    @Override
    public List<ProductDomain> findAllProducts() {
        return productMapper.productEntityListToProductDomainList(productRepository.findAll());
    }
}

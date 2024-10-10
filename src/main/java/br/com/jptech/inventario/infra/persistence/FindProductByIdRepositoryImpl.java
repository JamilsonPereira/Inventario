package br.com.jptech.inventario.infra.persistence;

import br.com.jptech.inventario.application.mapper.ProductMapper;
import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.core.gateway.FindProductByIdRepository;
import br.com.jptech.inventario.infra.repository.ProductRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindProductByIdRepositoryImpl implements FindProductByIdRepository {

    ProductRepository productRepository;

    private ProductMapper productMapper;

    @Override
    public ProductDomain findById(Long id) {

        return productRepository.findById(id).map(productMapper::productEntityToProduct).get();
    }
}
package br.com.jptech.inventario.infra.persistence;

import br.com.jptech.inventario.application.mapper.ProductMapper;
import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.core.gateway.PatchProductRepository;
import br.com.jptech.inventario.infra.entitie.ProductEntity;
import br.com.jptech.inventario.infra.repository.ProductRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PatchProductRepositoryImpl implements PatchProductRepository {
     ProductRepository productRepository;

    private ProductMapper productMapper;

    @Override
    public void patchProduct(ProductDomain productDomain, Long id) {
      ProductEntity productEntity = productRepository.findById(id).get();
      productEntity.setName(productDomain.getName());
      productEntity.setDescription(productDomain.getDescription());
      productEntity.setPrice(productDomain.getPrice());
      productEntity.setQuantity(productDomain.getQuantity());

      productRepository.save(productEntity);
    }
}
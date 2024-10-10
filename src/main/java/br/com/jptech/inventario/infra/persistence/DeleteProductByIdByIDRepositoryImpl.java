package br.com.jptech.inventario.infra.persistence;

import br.com.jptech.inventario.core.gateway.DeleteProductByIDRepository;
import br.com.jptech.inventario.infra.repository.ProductRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteProductByIdByIDRepositoryImpl implements DeleteProductByIDRepository {
    ProductRepository productRepository;

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}

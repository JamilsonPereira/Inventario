package br.com.jptech.inventario.core.usecase.impl;

import br.com.jptech.inventario.core.gateway.DeleteProductByIDRepository;
import br.com.jptech.inventario.core.usecase.DeleteProductUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteProductUseCaseImpl implements DeleteProductUseCase {

    DeleteProductByIDRepository deleteProductByIDRepository;

    @Override
    public void deleteProduct(Long id) {
        deleteProductByIDRepository.deleteById(id);
    }
}

package br.com.jptech.inventario.core.usecase.impl;

import br.com.jptech.inventario.core.domain.SupplierDomain;
import br.com.jptech.inventario.core.gateway.RegisterSupllierRepository;
import br.com.jptech.inventario.core.usecase.RegisterSupplierUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class RegisterSupplierUseCaseImpl implements RegisterSupplierUseCase {

    @Autowired
    RegisterSupllierRepository registerSupllierRepository;

    @Override
    public void registerSupplier(SupplierDomain supplierDomain) {

        registerSupllierRepository.save(supplierDomain);
    }
}

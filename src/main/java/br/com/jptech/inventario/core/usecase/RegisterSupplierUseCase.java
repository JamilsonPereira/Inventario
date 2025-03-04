package br.com.jptech.inventario.core.usecase;

import br.com.jptech.inventario.core.domain.SupplierDomain;

public interface RegisterSupplierUseCase {

    SupplierDomain registerSupplier(SupplierDomain supplierDomain);
}

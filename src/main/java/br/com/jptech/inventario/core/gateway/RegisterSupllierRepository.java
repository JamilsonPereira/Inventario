package br.com.jptech.inventario.core.gateway;

import br.com.jptech.inventario.core.domain.SupplierDomain;

public interface RegisterSupllierRepository {

    void save(SupplierDomain supplierDomain);
}

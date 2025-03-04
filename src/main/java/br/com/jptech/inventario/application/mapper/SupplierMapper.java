package br.com.jptech.inventario.application.mapper;

import br.com.jptech.inventario.application.dto.SupplierRequest;
import br.com.jptech.inventario.application.dto.SupplierResponse;
import br.com.jptech.inventario.core.domain.SupplierDomain;

public interface SupplierMapper {
    SupplierDomain supplierResquestToDomain(SupplierRequest supplierRequest);

    SupplierResponse productDomainToProductResponse(SupplierDomain supplierDomain);
}

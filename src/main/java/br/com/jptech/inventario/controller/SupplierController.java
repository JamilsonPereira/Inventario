package br.com.jptech.inventario.controller;

import br.com.jptech.inventario.application.dto.SupplierRequest;
import br.com.jptech.inventario.application.dto.SupplierResponse;
import br.com.jptech.inventario.application.mapper.SupplierMapper;
import br.com.jptech.inventario.core.domain.SupplierDomain;
import br.com.jptech.inventario.core.usecase.RegisterSupplierUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/product")
@AllArgsConstructor
public class SupplierController {

    private  final RegisterSupplierUseCase registerSupplierUseCase;
    private final SupplierMapper supplierMapper;

    @PostMapping
    public ResponseEntity<SupplierResponse> registerProduct(@RequestBody SupplierRequest supplierRequest) {
        SupplierDomain productDomain = registerSupplierUseCase.registerSupplier(supplierMapper.supplierResquestToDomain(supplierRequest));
        return ResponseEntity.ok((supplierMapper.productDomainToProductResponse(productDomain)));
    }
}

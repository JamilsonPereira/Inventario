package br.com.jptech.inventario.controller;

import br.com.jptech.inventario.application.dto.ProductDto;
import br.com.jptech.inventario.application.dto.ProductResponse;
import br.com.jptech.inventario.application.mapper.ProductMapper;
import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.core.usecase.RegisterProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    private RegisterProductUseCase registerProductUseCase;

    @PostMapping
    public ResponseEntity<ProductResponse> registerProduct(@RequestBody ProductDto productDto) {
        ProductDomain productDomain = registerProductUseCase.saveProduct(productMapper.productDtoToProduct(productDto));
        return ResponseEntity.ok((productMapper.productDomainToProductResponse(productDomain)));
    }
}
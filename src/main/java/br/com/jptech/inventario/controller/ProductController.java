package br.com.jptech.inventario.controller;

import br.com.jptech.inventario.application.dto.ProductRequest;
import br.com.jptech.inventario.application.dto.ProductResponse;
import br.com.jptech.inventario.application.mapper.ProductMapper;
import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.core.usecase.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
@AllArgsConstructor
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    private RegisterProductUseCase registerProductUseCase;

    private FindAllProductsUseCase findAllProductsUseCase;

    private FindProductByIdUseCase findProductByIdUseCase;

    private DeleteProductUseCase deleteProductUseCase;

    private PatchProductUseCase patchProductUseCase;

    @PostMapping
    public ResponseEntity<ProductResponse> registerProduct(@RequestBody ProductRequest productRequest) {
        ProductDomain productDomain = registerProductUseCase.saveProduct(productMapper.productDtoToProduct(productRequest));
        return ResponseEntity.ok((productMapper.productDomainToProductResponse(productDomain)));
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> findAllProducts() {
        List<ProductDomain> productDomainList = findAllProductsUseCase.findAllProducts();
        return ResponseEntity.ok(productMapper.productDomainListToProductResponseList(productDomainList));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> findById(@PathVariable("id") Long id) {
        ProductDomain productDomain = findProductByIdUseCase.findById(id);
        return ResponseEntity.ok((productMapper.productDomainToProductResponse(productDomain)));
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        deleteProductUseCase.deleteProduct(id);
    }

    @PutMapping("/{id}")
    public void patchProduct(@RequestBody ProductRequest productRequest, @PathVariable("id") Long id) {
        ProductDomain productDomain = productMapper.productDtoToProduct(productRequest);

        patchProductUseCase.patchProduct(productDomain, id);
    }
}
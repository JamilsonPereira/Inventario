package br.com.jptech.inventario.application.mapper;

import br.com.jptech.inventario.application.dto.ProductRequest;
import br.com.jptech.inventario.application.dto.ProductResponse;
import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.infra.entitie.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductRequest productToProductDto(ProductDomain productDomain);
    ProductDomain productDtoToProduct(ProductRequest productRequest);
    ProductEntity productDtoToProductEntity(ProductRequest productRequest);
    ProductDomain productEntityToProduct(ProductEntity productEntity);

    ProductEntity productDomainToProductEntity(ProductDomain productDomain);

    ProductResponse productDomainToProductResponse(ProductDomain productDomain);

    List<ProductDomain> productEntityListToProductDomainList(List<ProductEntity> productEntityList);

    List<ProductResponse> productDomainListToProductResponseList(List<ProductDomain> productDomainList);

}

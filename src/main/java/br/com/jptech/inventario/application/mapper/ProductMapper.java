package br.com.jptech.inventario.application.mapper;

import br.com.jptech.inventario.application.dto.ProductDto;
import br.com.jptech.inventario.application.dto.ProductResponse;
import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.infra.entitie.ProductEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDto productToProductDto(ProductDomain productDomain);
    ProductDomain productDtoToProduct(ProductDto productDto);
    ProductEntity productDtoToProductEntity(ProductDto productDto);
    ProductDomain productEntityToProduct(ProductEntity productEntity);

    ProductEntity productDomainToProductEntity(ProductDomain productDomain);

    ProductResponse productDomainToProductResponse(ProductDomain productDomain);

    List<ProductDomain> productEntityListToProductDomainList(List<ProductEntity> productEntityList);

    List<ProductResponse> productDomainListToProductResponseList(List<ProductDomain> productDomainList);

}

package br.com.jptech.inventario.application.mapper;

import br.com.jptech.inventario.application.dto.ProductDto;
import br.com.jptech.inventario.application.dto.ProductResponse;
import br.com.jptech.inventario.core.domain.ProductDomain;
import br.com.jptech.inventario.infra.entitie.ProductEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface ProductMapper {
    ProductDto productToProductDto(ProductDomain productDomain);
    ProductDomain productDtoToProduct(ProductDto productDto);
    ProductEntity productDtoToProductEntity(ProductDto productDto);
    ProductDomain productEntityToProduct(ProductEntity productEntity);

    ProductEntity productDomainToProductEntity(ProductDomain productDomain);

    ProductResponse productDomainToProductResponse(ProductDomain productDomain);
}

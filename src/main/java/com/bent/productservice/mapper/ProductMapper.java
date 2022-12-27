package com.bent.productservice.mapper;

import com.bent.productservice.dto.ProductRequest;
import com.bent.productservice.dto.ProductResponse;
import com.bent.productservice.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductRequest productToProductRequest(Product product);

    ProductResponse productToProductResponse(Product product);

    Product productRequestToProduct(ProductRequest ProductRequest);

    Product productResponseToProduct(ProductResponse productResponse);
}

package com.bent.productservice;

import com.bent.productservice.model.Product;
import com.bent.productservice.repository.ProductRepository;
import com.bent.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
@RequiredArgsConstructor
public class ProductServiceApplication implements CommandLineRunner {
    private final ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        if (productRepository.count() < 1) {
            Product product = new Product();
            product.setName("Bent");
            product.setDescription("Bent is a mobile application developed by Alibaba");
            product.setPrice(new BigDecimal(1000));
            productRepository.save(product);
        }
    }

}

package com.example.demo.product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Void> createProduct() {
        Long productId = productService.createProduct();
        return ResponseEntity.created(URI.create("/products/" + productId)).build();
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllProducts() {
        List<String> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<String> getProduct(@PathVariable Long productId) {
        String product = productService.getProductById(productId);
        return ResponseEntity.ok(product);
    }

    @PatchMapping("/{productId}")
    public ResponseEntity<Void> updateProduct(@PathVariable Long productId) {
        productService.updateProduct(productId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }
}
package com.example.demo.product;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    public void createProduct() {
        String existingProduct = null;

        if (existingProduct != null) {
            throw new RuntimeException("이미 존재하는 상품입니다.");
        }
    }

    public List<String> getAllProducts() {
        return null;
    }

    public String getProductById(Long id) {
        String product = null;

        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다");
        }

        return product;
    }

    public void updateProduct(Long id) {
        String product = null;

        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다");
        }
    }

    public void deleteProduct(Long id) {
        String product = null;

        if (product == null) {
            throw new RuntimeException("상품을 찾을 수가 없습니다");
        }
    }
}
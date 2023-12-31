package com.restapifor.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapifor.model.pro;
import com.restapifor.repository.ProductsRepository;

@Service
public class SecondService {
    @Autowired
    private ProductsRepository productRepository;

    public List<pro> getAllProducts() {
        return productRepository.findAll();
    }

    public pro getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public pro createProduct(pro product) {
        return productRepository.save(product);
    }

    public pro updateProduct(pro product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
    public List<pro> getAllProducts(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<pro> productPage = productRepository.findAll(pageable);
        return productPage.getContent();
    }

}


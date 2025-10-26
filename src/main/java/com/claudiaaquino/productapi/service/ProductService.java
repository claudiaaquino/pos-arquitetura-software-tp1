package com.claudiaaquino.productapi.service;

import com.claudiaaquino.productapi.model.Product;
import com.claudiaaquino.productapi.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Product findById(Long id) {
        return repository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Product not found: id=" + id));
    }

    @Transactional(readOnly = true)
    public List<Product> findByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

    @Transactional
    public Product create(Product product) {
        product.setId(null);
        return repository.save(product);
    }

    @Transactional
    public Product update(Long id, Product updated) {
        Product existing = findById(id);
        existing.setName(updated.getName());
        existing.setDescription(updated.getDescription());
        existing.setPrice(updated.getPrice());
        existing.setStock(updated.getStock());
        return repository.save(existing);
    }

    @Transactional
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Product not found: id=" + id);
        }
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public long count() {
        return repository.count();
    }
}

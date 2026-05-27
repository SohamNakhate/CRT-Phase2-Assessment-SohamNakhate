package com.example.demo.que_17;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.*;

class ProductServiceTest {

    @Mock
    private ProductRepository repo;

    @InjectMocks
    private ProductService service;

    @Test
    void testGetById() {

        Product product = new Product();
        product.setProdId(1);
        product.setProdName("Laptop");

        when(repo.findById(1)).thenReturn(product);

        Product result = service.getById(1);

        assertEquals("Laptop", result.getProdName());
    }
}
package com.prasad.simpleWebApp.Controller;

import com.prasad.simpleWebApp.Model.Product;
import com.prasad.simpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProduct(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        service.addProduct(product);
        return product;
    }
}

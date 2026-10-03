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

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        service.updateProduct(product);
        return product;
    }

    @DeleteMapping("/{id}")
    public Product deleteProduct(@PathVariable int id){
        Product deletedProduct = service.getProduct(id);
        service.deleteProduct(id);
        return deletedProduct;
    }
}

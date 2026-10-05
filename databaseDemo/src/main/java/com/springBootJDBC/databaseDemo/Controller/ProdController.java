package com.springBootJDBC.databaseDemo.Controller;

import com.springBootJDBC.databaseDemo.Model.Product;
import com.springBootJDBC.databaseDemo.Service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProdController {

    @Autowired
    ProdService service;

    @GetMapping
    public List<Product> getProduct(){
        return service.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id){
        return service.getProduct(id);
    }

    @PostMapping("/")
    public Product addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }

    @DeleteMapping("/")
    public Product deleteProduct(@RequestBody Product product){
        return service.deleteProduct(product);
    }

    @PutMapping("/")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
}

package com.springBootJDBC.databaseDemo.Service;

import com.springBootJDBC.databaseDemo.Model.Product;
import com.springBootJDBC.databaseDemo.Repository.ProdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdService {

    @Autowired
    ProdRepo repo;
    public Product getProduct(int id){
        return repo.findById(id).orElse(null);
    }

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product addProduct(Product product){
        return repo.save(product);
    }

    public Product deleteProduct(Product product){
        Product deletedProduct = repo.findById(product.getId()).orElse(null);
        repo.delete(product);
        return deletedProduct;
    }

    public Product updateProduct(Product product){
        return repo.save(product);
    }
}

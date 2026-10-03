package com.prasad.simpleWebApp.Service;

import com.prasad.simpleWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "iPhone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103, "Mic", 40000)
    ));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProduct(int id){
        for(Product product : products){
            if(product.getProdId() == id){
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product product){
        products.add(product);
        System.out.println(product.getProdName());
    }

}

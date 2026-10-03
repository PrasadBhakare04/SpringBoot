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

    public void updateProduct(Product product){
        int idx = -1;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProdId() == product.getProdId()){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            System.out.println("Product not found new product created");
             products.add(product);
        }

        else{
             products.set(idx, product);
        }
    }

    public void deleteProduct(int id){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProdId() == id){
                products.remove(i);
                break;
            }
        }
    }

}

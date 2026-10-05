package com.springBootJDBC.databaseDemo.Repository;
import com.springBootJDBC.databaseDemo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface ProdRepo extends JpaRepository<Product, Integer>{
}

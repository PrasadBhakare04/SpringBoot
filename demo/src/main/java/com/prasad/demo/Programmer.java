package com.prasad.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
    // Field injection
    @Autowired
    private Laptop laptop;

//-----------------------------------------------------
    //Constructor injection

//    public Programmer(Laptop laptop){
//        this.laptop = laptop;
//    }
//-----------------------------------------------------

    //Setter injection

//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){
        laptop.compile();
    }

}

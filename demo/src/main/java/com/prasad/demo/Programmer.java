package com.prasad.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
    // Field injection
    @Autowired
    @Qualifier("laptop")
    private Computer comp;

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
        comp.compile();
    }

}

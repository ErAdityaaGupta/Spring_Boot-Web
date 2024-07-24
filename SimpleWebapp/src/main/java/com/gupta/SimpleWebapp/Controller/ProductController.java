package com.gupta.SimpleWebapp.Controller;

import com.gupta.SimpleWebapp.Model.Product;
import com.gupta.SimpleWebapp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    //@RequestMapping("/products")
    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    //@RequestMapping("/products/{prodId}")
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    //@RequestMapping("/products")
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }

}

package com.gupta.SimpleWebapp.Service;

import com.gupta.SimpleWebapp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(001,"Phone",60000),
                                           new Product(002,"Ipad",90000));

    public List<Product> getProducts(){
        return products;
    }

}

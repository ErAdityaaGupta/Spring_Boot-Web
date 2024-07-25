package com.gupta.SimpleWebapp.Service;

import com.gupta.SimpleWebapp.Model.Product;
import com.gupta.SimpleWebapp.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(001,"Phone",60000),
//                                           new Product(002,"Ipad",90000)));

    public List<Product> getProducts(){
//        return products;
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
//        return products.stream()
//                .filter(p -> p.getProdId() == prodId)
//                .findFirst().orElse(new Product(000,"No Item Found",0));
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index = 0;
//        for(int i =0; i<products.size();i++){
//            if(products.get(i).getProdId() == prod.getProdId()){
//                index = i;
//            }
//        }
//
//        products.set(index,prod);

        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
//        int index = 0;
//        for(int i =0; i<products.size();i++){
//            if(products.get(i).getProdId() == prodId){
//                index = i;
//            }
//        }
//
//        products.remove(index);

        repo.deleteById(prodId);
    }
}

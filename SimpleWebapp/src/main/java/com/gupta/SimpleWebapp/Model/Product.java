package com.gupta.SimpleWebapp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public  class Product {

    private int prodId;
    private String prodName;
    private int price;



}

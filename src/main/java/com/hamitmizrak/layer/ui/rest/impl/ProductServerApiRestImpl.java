package com.hamitmizrak.layer.ui.rest.impl;

import com.hamitmizrak.layer.business.ProductDto;
import com.hamitmizrak.layer.ui.rest.IProductApiRest;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//lombok
@Log4j2

//api
@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class ProductServerApiRestImpl implements IProductApiRest {

    // http://localhost:8080/api/v1/rest/data1
    @GetMapping("rest/data1")
    public ProductDto getRest1(){
        ProductDto productDto=ProductDto.builder()
                .id(10L)
                .name("ürün adı")
                .price(44)
                .build();
        return productDto;
    }


    // http://localhost:8080/api/v1/rest/data2
    @GetMapping(value = "rest/data2",produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductDto getRest2(){
        ProductDto productDto=ProductDto.builder()
                .id(10L)
                .name("ürün adı")
                .price(44)
                .build();
        return productDto;
    }

    // http://localhost:8080/api/v1/rest/data3
    @GetMapping(value = "rest/data3",produces = "application/json;charset=UTF-8")
    public ProductDto getRest3(){
        ProductDto productDto=ProductDto.builder()
                .id(10L)
                .name("ürün adı")
                .price(44)
                .build();
        return productDto;
    }

    // http://localhost:8080/api/v1/rest/data4
    @Override
    @GetMapping("rest/data4")
    public List<ProductDto> getRest4(){
        List<ProductDto> list = new ArrayList<ProductDto>();
        for (int i = 1; i <=5 ; i++) {
            list.add(ProductDto.builder().id(Long.valueOf(i)).name("ürün adı "+i).price(i*10).build());
        }
        return list;
    }
}

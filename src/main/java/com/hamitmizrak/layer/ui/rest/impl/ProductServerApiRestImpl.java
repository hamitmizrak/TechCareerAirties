package com.hamitmizrak.layer.ui.rest.impl;

import com.hamitmizrak.layer.business.ProductDto;
import com.hamitmizrak.layer.ui.rest.IProductApiRest;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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


    // http://localhost:8080/api/v1/rest/data5
    @GetMapping("rest/data5")
    public ResponseEntity<ProductDto> getRest5(){
        ProductDto productDto=ProductDto.builder()
                .id(10L)
                .name("ürün adı")
                .price(44)
                .build();
        //return ResponseEntity.ok(productDto);
        //return ResponseEntity.ok().body(productDto);
        //return ResponseEntity.status(200).body(productDto);
        return ResponseEntity.status(HttpStatus.OK).body(productDto);
    }


    // http://localhost:8080/api/v1/rest/data6/4
    @GetMapping({"rest/data6","rest/data6/{id}"})
    public ResponseEntity<?> getRest6(@PathVariable(name="id",required = false) Long id){
        ProductDto productDto=ProductDto.builder()
                .id(id)
                .name("ürün adı")
                .price(44)
                .build();
        if(id==null)
            return ResponseEntity.notFound().build();
        else if(id==0)
            return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(productDto);
    }

    // http://localhost:8080/api/v1/rest/cors
    @GetMapping("rest/cors")
    public String getRest7(){
        return "Merhabalar ben Java Api'dan geldim";
    }

    // http://localhost:8080/api/v1/rest/data8
    @GetMapping("rest/data8")
    public ResponseEntity<?> getRest8(){
     return ResponseEntity.ok()
             .header("rest_header","@RestController")
             .body("@RestController Body");
    }

}

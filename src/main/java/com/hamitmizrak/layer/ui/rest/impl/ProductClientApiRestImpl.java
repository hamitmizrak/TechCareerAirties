package com.hamitmizrak.layer.ui.rest.impl;

import com.hamitmizrak.layer.business.ProductDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;

//lombok
@Log4j2
@Controller  //Spring MVC
public class ProductClientApiRestImpl  {

    // http://localhost:8080/api/v1/rest/data1
    // @GetMapping
    // Object data

    // http://localhost:8080/client/data4
    @GetMapping("client/data4")
    @ResponseBody
    public List<ProductDto> getRest4(){
        String URL="http://localhost:8080/api/v1/rest/data4";
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<List<ProductDto>> responseEntity=restTemplate.exchange(URL, HttpMethod.GET, HttpEntity.EMPTY,
                new ParameterizedTypeReference<List<ProductDto>>() {});

        List<ProductDto> productDtoList=responseEntity.getBody();
        for(ProductDto temp:productDtoList ){
            System.out.println(temp);
        }
        return productDtoList;
    }

}

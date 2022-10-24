package com.hamitmizrak.layer.ui.mvc;

import com.hamitmizrak.layer.business.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//PostMapping
//DeleteMapping
//PutMapping
@Controller
public class ProductMvc implements Serializable {

    // http://localhost:8080/mvc1
    //GetMapping
    @GetMapping("/mvc1")
    @ResponseBody
    public String mvc1() {
        return "Gövdesiz Data";
    }

    // http://localhost:8080/mvc2
    //GetMapping
    @GetMapping("/mvc2")
    public String mvc2(Model model) {
        model.addAttribute("key_mvc", "Merhabalar ben Modelden geldim");
        return "mvc2";
    }

    // http://localhost:8080/mvc3
    //GetMapping
    @GetMapping("/mvc3")
    public String mvc3(Model model) {
        ProductDto productDto = ProductDto.builder().id(44L).price(55).name("ürün adı").build();
        model.addAttribute("key_mvc", productDto);
        return "mvc3";
    }


    // http://localhost:8080/mvc4
    // http://localhost:8080/mvc4/10
    //GetMapping
    @GetMapping({"/mvc4/{price}","/mvc4"})
    public String mvc4(Model model, @PathVariable(name="price",required = false) Long price) {
        List<ProductDto> list = new ArrayList<>();
        list.add(ProductDto.builder().id(10L).price(price*2).name("ürün adı50").build());
        list.add(ProductDto.builder().id(20L).price(price*3).name("ürün adı60").build());
        list.add(ProductDto.builder().id(30L).price(price*4).name("ürün adı70").build());
        model.addAttribute("key_mvc", list);
        return "mvc4";
    }


    // http://localhost:8080/mvc5?price=10
    //GetMapping
    @GetMapping({"/mvc5"})
    public String mvc5(Model model, @RequestParam(name="price",required = false,defaultValue = "1") Long price) {
        List<ProductDto> list = new ArrayList<>();
        list.add(ProductDto.builder().id(10L).price(price*2).name("ürün adı50").build());
        list.add(ProductDto.builder().id(20L).price(price*3).name("ürün adı60").build());
        list.add(ProductDto.builder().id(30L).price(price*4).name("ürün adı70").build());
        model.addAttribute("key_mvc", list);
        return "mvc5";
    }

}

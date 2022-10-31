package com.hamitmizrak.layer.ui.rest;

import com.hamitmizrak.layer.business.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IProductApiRest {
    // http://localhost:8080/api/v1/rest/data4
    List<ProductDto> getRest4();
}

package com.hamitmizrak.annotationdata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    @ParameterDataMinMax(min = 1,max = 20)
    private String firstName;
}

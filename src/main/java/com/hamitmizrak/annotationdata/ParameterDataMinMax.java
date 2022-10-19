package com.hamitmizrak.annotationdata;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ParameterDataMinMax {

    int min() default 1;
    int max() default 100;
}

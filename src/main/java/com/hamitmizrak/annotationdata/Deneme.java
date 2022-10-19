package com.hamitmizrak.annotationdata;


import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface Deneme {
}

package com.hamitmizrak.tutorials;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private Long id;
    private String username;
    private String surname;
    private int number;

    public void numberMethod(){
        System.out.println(this.number);
    }

}

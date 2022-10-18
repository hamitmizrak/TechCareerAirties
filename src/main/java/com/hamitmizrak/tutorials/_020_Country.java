package com.hamitmizrak.tutorials;


import lombok.Getter;
import lombok.Setter;

public class _020_Country {

    @Getter @Setter
    private String countryName;

    //inner class
    public static class City{
        @Getter @Setter
        private String cityName;
    }
}

class InnerMainClass{
    public static void main(String[] args) {
        _020_Country country=new _020_Country();
        country.setCountryName("Türkiye");

        _020_Country.City city=new _020_Country.City();
        city.setCityName("Malatya");

        System.out.println("Ülke Adı: "+country.getCountryName()+" Şehir Adı: "+city.getCityName());

    }
}

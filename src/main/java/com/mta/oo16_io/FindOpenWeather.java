package com.mta.oo16_io;

import java.io.InputStream;
import java.net.URL;

public class FindOpenWeather {
    public static void main(String[] args) {
        String cityName = "taiwan,taoyuan";
        String id = "";
        String urlstr = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";
        urlstr = String.format(urlstr, cityName, id);
        System.out.println(urlstr);
        try {
            URL url = new URL(urlstr);
            InputStream is = url.openStream();
            int data = 0;
            String jsonstr = "";
            while ( (data = is.read()) != -1) {
                //System.out.print((char)data);
                jsonstr += (char)data;
            }
            is.close();
            System.out.println(jsonstr);
        } catch (Exception e) {
        }
        
        
    }
}

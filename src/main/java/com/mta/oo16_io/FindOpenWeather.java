package com.mta.oo16_io;

import java.io.InputStream;
import java.net.URL;
import org.json.JSONObject;

public class FindOpenWeather {
    public static void main(String[] args) {
        String cityName = "taoyuan,TW";
        String id = "fcc57465b76d35357c84e4e30fe2431a";
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
            // 利用 org.json 剖析 jsonstr 字串
            JSONObject root = new JSONObject(jsonstr);
            JSONObject main = root.getJSONObject("main");
            double temp = main.getDouble("temp") - 273.15;
            int humidity = main.getInt("humidity");
            System.out.printf("目前溫度: %.2f °C\n", temp);
            System.out.printf("目前濕度: %d %%\n", humidity);
            
        } catch (Exception e) {
        }
        
        
    }
}

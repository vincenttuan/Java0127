package com.mta.oo17_io;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import org.json.JSONObject;

public class Util {
    private static final String ID = "fcc57465b76d35357c84e4e30fe2431a";
    private static final String URL_STRING = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";
    public Weather getWeather(String country, String cityName) {
        String q = cityName + "," + country;
        String urlstr = String.format(URL_STRING, q, ID);
        String jsonstr = "";
        Weather weather = new Weather();
        try {
            Reader r = new InputStreamReader(new URL(urlstr).openStream());
            int data = 0;
            while((data = r.read()) != -1){
                jsonstr += (char)data;
            }
            // 分析 json
            JSONObject root = new JSONObject(jsonstr);
            // 將 json 的資料配置到 weather 的物件屬性內
            weather.setCountry(root.getJSONObject("sys").getString("country"));
            weather.setCityName(root.getString("name"));
            weather.setTemp(root.getJSONObject("main").getDouble("temp"));
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return weather;
    }
}

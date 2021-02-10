package com.foodsafety;

import com.google.gson.Gson;
import java.net.URL;
import java.util.Scanner;

public class Util {
    public static Rice[] queryBadRices() {
        String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        try {
            URL url = new URL(path);
            String json = new Scanner(url.openStream(), "utf-8").useDelimiter("\\A").next();
            Rice[] rices = new Gson().fromJson(json, Rice[].class);
            return rices;
        } catch (Exception e) {
        }
        return null;
    }
    public static Rice[] queryGoodRices() {
        String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceQualified.aspx";
        try {
            URL url = new URL(path);
            String json = new Scanner(url.openStream(), "utf-8").useDelimiter("\\A").next();
            Rice[] rices = new Gson().fromJson(json, Rice[].class);
            return rices;
        } catch (Exception e) {
        }
        return null;
    }
}

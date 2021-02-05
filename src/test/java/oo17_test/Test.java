package oo17_test;

import com.mta.oo17_io.Util;
import com.mta.oo17_io.Weather;

public class Test {
    @org.junit.Test
    public void t1() {
        Util util = new Util();
        Weather weather = util.getWeather("TW", "taoyuan");
        System.out.println(weather);
        Weather weather2 = util.getWeather("TW", "taipei");
        System.out.println(weather2);
        Weather weather3 = util.getWeather("TW", "taichung");
        System.out.println(weather3);
        Weather weather4 = util.getWeather("TW", "kaohsiung");
        System.out.println(weather4);
    }
}

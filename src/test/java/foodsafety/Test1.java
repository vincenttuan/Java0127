package foodsafety;

import com.foodsafety.Rice;
import com.google.gson.Gson;
import java.net.URL;
import java.util.Scanner;
import org.junit.Test;

public class Test1 {
    @Test
    public void t1() {
        String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        try {
            URL url = new URL(path);
            String json = new Scanner(url.openStream(), "utf-8").useDelimiter("\\A").next();
            //System.out.println(json);
            //利用 Gson 將 json 字串 mapping 到 Rice[] 陣列中
            Rice[] rices = new Gson().fromJson(json, Rice[].class);
            System.out.printf("取得筆數: %d\n", rices.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}

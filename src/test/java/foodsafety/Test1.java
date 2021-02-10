package foodsafety;

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
            // 將 json 字串 mapping 到 Rice[] 陣列中
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}

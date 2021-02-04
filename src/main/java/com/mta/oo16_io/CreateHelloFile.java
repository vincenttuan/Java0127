package com.mta.oo16_io;

import java.io.File;
import java.io.IOException;

public class CreateHelloFile {
    public static void main(String[] args) {
        String fp = "src\\main\\java\\com\\mta\\oo16_io\\files\\Hello.txt";
        File f = new File(fp);
        System.out.printf("Hello.txt 是否存在? %b\n", f.exists());
        // 判斷 Hello.txt 檔案是否存在 ?
        // 若檔案不存在就建立新檔案
        if(!f.exists()) { 
            try {
                boolean check = f.createNewFile();
                if(check) {
                    System.out.println("建立成功");
                } else {
                    System.out.println("建立失敗");
                }
            } catch (IOException ex) {
                // ex.toString() 印出簡要錯誤資訊
                System.out.printf("建立錯誤: %s\n", ex.toString());
                ex.printStackTrace(); // 印出詳細錯誤資訊
            }
        }
    }
}

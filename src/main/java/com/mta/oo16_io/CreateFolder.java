package com.mta.oo16_io;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        String fp = "src\\main\\java\\com\\mta\\oo16_io\\files";
        File f = new File(fp);
        System.out.printf("\\files 資料夾是否存在? %b\n", f.exists());
        if(!f.exists()) {
            boolean check = f.mkdir();
            if(check) {
                System.out.println("資料夾建立成功");
            } else {
                System.out.println("資料夾建立失敗");
            }
        }
    }
}

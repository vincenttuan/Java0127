package com.mta.oo16_io;

import java.io.File;
import java.io.IOException;

public class DeleteTempFiles {

    public static void main(String[] args) {
        // 指定一個目錄
        File dir = new File("src\\main\\java\\com\\mta\\oo16_io\\files");
        if(dir.isDirectory()) {
            String[] fileNames = dir.list(); // 取得該路徑下所有的名稱(檔名or資料夾名)
            for(String fname : fileNames) {
                File f = new File(dir.getPath() + File.separator + fname); // 組合成完整路徑
                System.out.println(f);
                if(f.isFile() && fname.contains("temp")) {
                    f.delete();
                }
            }
        } else {
            System.out.printf("%s 不是目錄\n", dir);
        }
    }
}

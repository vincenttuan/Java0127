package com.mta.oo16_io;

import java.io.File;
import java.io.IOException;

public class CreateTempFiles {

    public static void main(String[] args) {
        // 指定一個目錄
        File dir = new File("src\\main\\java\\com\\mta\\oo16_io\\files");
        for (int i = 0; i < 10; i++) {
            try {
                // 建立 temp file
                File.createTempFile("temp", ".txt", dir);
            } catch (IOException ex) {
                System.out.printf("建立錯誤: %s\n", ex.toString());
            }
        }
    }
}

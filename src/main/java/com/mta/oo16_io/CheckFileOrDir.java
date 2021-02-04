package com.mta.oo16_io;

import java.io.File;

public class CheckFileOrDir {
    public static void main(String[] args) {
        File f1 = new File("src\\main\\java\\com\\mta\\oo16_io\\files");
        File f2 = new File("src\\main\\java\\com\\mta\\oo16_io\\files\\Hello.txt");
        
        System.out.printf("%s 是檔案: %b 是目錄: %b\n", f1, f1.isFile(), f1.isDirectory());
        System.out.printf("%s 是檔案: %b 是目錄: %b\n", f2, f2.isFile(), f2.isDirectory());
    }
}

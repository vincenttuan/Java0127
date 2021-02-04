package com.mta.oo16_io;

import java.io.File;

public class DeleteHelloFile {
    public static void main(String[] args) {
        String fp = "src\\main\\java\\com\\mta\\oo16_io\\files\\Hello.txt";
        File f = new File(fp);
        System.out.printf("Hello.txt 是否存在? %b\n", f.exists());
        // 若檔案存在就刪除
        if(f.exists()) {
            boolean check = f.delete();
            if(check) {
                System.out.println("刪除成功");
            } else {
                System.out.println("刪除失敗");
            }
        }
    }
}

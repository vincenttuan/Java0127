package com.mta.oo16_io;

// 利用 Recursive 遞迴技巧來刪除所有子目錄下面的檔案

import java.io.File;

public class RecursiveDeleteFiles {
    public static void main(String[] args) {
        File file = new File("C:/temp");
        deleteFile(file);
    }
    
    public static void deleteFile(File file) {
        if(file.isFile()) {
            file.delete();
        } else {
            for(String fname : file.list()) {
                File f = new File(file.getPath() + File.separator + fname);
                deleteFile(f);
            }
        }
    }
}

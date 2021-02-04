package com.mta.oo16_io;

import java.io.FileReader;

public class ReadFileDemo {
    public static void main(String[] args) {
        
        try(FileReader fr = new FileReader("src\\main\\java\\com\\mta\\oo16_io\\files\\Hello.txt");) {
            int data = 0;
            String message = "";
            while ((data = fr.read()) != -1) {
                System.out.println(data + " --> " + (char)data);
                message += (char)data;
            }
            System.out.printf("文件內容: %s\n", message);
        } catch (Exception e) {
        }
        
    }
}

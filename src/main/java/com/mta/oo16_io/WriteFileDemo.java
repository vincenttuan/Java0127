package com.mta.oo16_io;

import java.io.FileWriter;

public class WriteFileDemo {
    public static void main(String[] args) {
        
        try(FileWriter fw = new FileWriter("src\\main\\java\\com\\mta\\oo16_io\\files\\Hello.txt");) {
            fw.write("Hello World 哈囉 !");
        } catch (Exception e) {
        }
        
    }
}

package com.mta.oo14_try;

public class IDCheckDemo {
    public static void main(String[] args) {
        String id = "A123456789";
        try {
            checkId(id);
        } catch (Exception ex) {
            System.err.println(ex);
            System.err.println(ex.getMessage());
        }
    }
    
    public static void checkId(String id) throws Exception {
        // 檢查 id 長度
        if(id.length() != 10) {
            // 製造一個錯誤, 並把錯誤拋出去
            Exception e = new Exception("身分證字號長度錯誤");
            throw e; // 將錯誤拋出
        }
        System.out.println("ID 合法");
    }
}

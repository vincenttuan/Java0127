package com.mta.oo14_try;

public class IDCheckDemo3 {
    public static void main(String[] args) {
        String id = "A1234567890";
        try {
            checkId(id);
        } catch (IDException ex) {
            System.err.println(ex);
            System.err.println(ex.getMessage());
            //ex.怎麼辦();
            ex.程式強迫停止();
        }
        System.out.println("程式結束");
    }
    
    public static void checkId(String id) throws IDException {
        // 檢查 id 長度
        if(id.length() != 10) {
            // 製造一個錯誤, 並把錯誤拋出去
            IDException e = new IDException("身分證字號長度錯誤");
            throw e; // 將錯誤拋出
        }
        System.out.println("ID 合法");
    }
}

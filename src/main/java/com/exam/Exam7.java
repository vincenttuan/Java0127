package com.exam;

public class Exam7 {

    public static void main(String[] args) {
        System.out.println(calculatePrice(true, 66, false));
    }
    /*
    一般入場券定價為 10 美元。此程式滿足以下需求：
    會員有權獲得折價券
    超過 65 歲的會員免入場費
    非會員可選擇除購買入場券外，加購會員卡，會員費用為 40 美元
    */
    static double calculatePrice(Boolean isMember, int age, Boolean buyMembership) {
        double price;
        if (isMember) {
            if (age > 65) {
                price = 0.0;
            } else {
                price = 3.0;
            }
        } else if (buyMembership) {
            price = 50.0;
        } else {
            price = 10.0;
        }
        return price;
    }
}

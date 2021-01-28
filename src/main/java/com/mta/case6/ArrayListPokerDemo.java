package com.mta.case6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPokerDemo {
    public static void main(String[] args) {
        ArrayList<Integer> poker = new ArrayList<>();
        for(int i=1;i<=52;i++) {
            poker.add(i);
        }
        // 洗牌
        Collections.shuffle(poker);
        
        System.out.println(poker);
        
        System.out.println(getPoker(poker, 0));
        System.out.println(getPoker(poker, 1));
        System.out.println(getPoker(poker, 2));
        System.out.println(getPoker(poker, 3));
        System.out.println(getPoker(poker, 4));
    }
    
    // position: 位置
    public static String getPoker(ArrayList<Integer> poker, int position) {
        String[] suite = {"黑桃", "紅心", "鑽石", "梅花"};
        String su = suite[poker.get(position) / 13];
        int n = poker.get(position) % 13;
        return su +(n==0?13:n);
    }
    
}

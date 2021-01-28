package com.mta.case5;

public class MultiArrayDemo4 {
    public static void main(String[] args) {
        // 對稱型陣列
        int[][] foo = {  // 2 x 3 的二維陣列
            {100, 90, 80},
            {70, 60, 50},
        };
        // 非對稱型陣列
        int[][] bar = {  // 2 x ? 的二維陣列
            {100, 90, 80},
            {70},
        };
        print(foo);
        print(bar);
    }
    
    // 印出二維陣列中的每一個元素
    public static void print(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int k=0;k<x[i].length;k++) {
                System.out.print(x[i][k] + " ");
            }
        }
        System.out.println();
    }
    
}

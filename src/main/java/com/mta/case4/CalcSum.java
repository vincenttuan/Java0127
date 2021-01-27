package com.mta.case4;

public class CalcSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        // 計算總和
        int sum = 0;
//        for(int i=0 ; i<nums.length ;i++) {
//            sum += nums[i];
//        }
        for(int i=0, len=nums.length ; i<len ;i++) {
            sum += nums[i];
        }
        
        System.out.println(sum);
    }
}

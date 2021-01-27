package com.mta.case4;

// 二數之和

import java.util.Arrays;

public class LeetCodeSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 5};
        int target = 13;
        for(int x=0, lenx=nums.length-1 ; x<lenx ; x++) {
            for(int y=x+1, leny=nums.length ; y<leny ; y++) {
                if(nums[x] + nums[y] == target) {
                    int[] ans = {x, y};
                    System.out.println(Arrays.toString(ans));
                    break;
                }
            }
        }
        // 結果要印出 [0, 2]
    }
}

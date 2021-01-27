package com.mta.case4;

// 二數之和

import java.util.Arrays;

public class LeetCodeSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 5};
        int target = 13;
        int x = 0;
        int y = 0;
        for(x=0;x<=2;x++) {
            for(y=x+1;y<=3;y++) {
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

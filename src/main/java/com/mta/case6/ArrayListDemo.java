package com.mta.case6;

// 動態陣列

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 靜態陣列
        int[] foo = {100, 90, 80};
        // 欲修改 foo[i] 的內容, i 只能是 0~2
        System.out.println(Arrays.toString(foo));
        System.out.println(foo[0]); // 取出陣列元素的第一筆
        System.out.println(foo.length); // 取出陣列長度
        // 動態陣列
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(90);
        list.add(80);
        System.out.println(list);
        System.out.println(list.get(0)); // 取出陣列元素的第一筆
        System.out.println(list.size()); // 取出陣列長度
    }
}

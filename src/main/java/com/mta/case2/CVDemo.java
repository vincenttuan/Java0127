package com.mta.case2;

/*
變異係數 C.V
比較同單位或不同單位資料的分散程度

調查五位學生之身高及體重如下，試比較其分散程度。
身高：172、168、164、170、176(公分)
體重：62、57、58、64、64(公斤)
公式：標準差(sd) / 平均(avg)
*/
public class CVDemo {
    // 身高陣列資料
    static double[] height = {172, 168, 164, 170, 176};
    // 體重陣列資料
    static double[] weight = {62, 57, 58, 64, 64};
    
    // 總和
    public static double getSum(double [] data) {
        double sum = 0.0;
        for(double d : data) {
            sum += d;
        }
        return sum;
    }
    
    // 平均
    public static double getAvg(double [] data) {
        double sum = getSum(data);
        double avg = sum / data.length;
        return avg;
    }
    
    // 主程式
    public static void main(String[] args) {
        // 平均身高
        double heightAvg = getAvg(height);
        // 平均體重
        double weightAvg = getAvg(weight);
        
        System.out.printf("平均身高: %.1f cm  平均體重: %.1f kg\n", heightAvg, weightAvg);
    }
}

package com.mta.case3;

// 常用的共用方法
public class Util {
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
    
    // 標準差 SD
    public static double getSD(double [] data) {
        double sd = 0.0;
        double avg = getAvg(data);
        // 平方差的和
        double diff = 0.0;
        for(double d : data) {
            diff += Math.pow(d - avg, 2); // Math.pow 次方
        }
        sd = Math.sqrt(diff / data.length); // Math.sqrt 開根號
        return sd;
    }
    
    // 變異係數 C.V 公式：標準差(sd) / 平均(avg)
    public static double getCV(double [] data) {
        double cv = 0.0;
        double sd = getSD(data);
        double avg = getAvg(data);
        cv = sd / avg;
        return cv;
    }
}

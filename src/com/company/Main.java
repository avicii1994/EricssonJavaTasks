package com.company;

import java.math.BigInteger;
import java.util.Scanner;
//Write a function:
//class Solution { public int solution(int N); }
//that, given a non-negative integer N, returns the number of digits equal to 1 in the decimal representation of the number 11 .
//        For example, given N=3 the function should return 2, because 11 =1331 and two digits of the number 1331 are equal to 1.
//        Write an efficient algorithm for the following assumptions
//        N is an integer within the range[0,10000].


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res= sc.nextInt();

        System.out.println(solution(res));
    }

    public static String getExponentialValue(int N) {
        BigInteger value = new BigInteger("1");

        while (N > 0) {
            value = multiplyBy11(value);
            N--;
        }
        return value.toString();
    }

    public static BigInteger multiplyBy11(BigInteger value) {
        return value.multiply(new BigInteger("11"));
    }

    public static int solution(int N) {
        String numberAsString = getExponentialValue(N);
        int occurencesOfDigit = 0;
        for (int index = 0; index < numberAsString.length(); index++)
            if (numberAsString.charAt(index) == '1')
                occurencesOfDigit++;

        return occurencesOfDigit;
    }
}
//public static void main(String[] args) {
//    System.out.println(solution(1));
//
////    BigInteger bigInteger = new BigInteger("1");
//
//}
//    public static String getExpValue(int n){
//    BigInteger val = new BigInteger("1");
//
//    while(n>0){
//        val = multiply11(val);
//        n--;
//    }
//    return val.toString();
//    }
//    public static BigInteger multiply11(BigInteger val){
//        return val.multiply(new BigInteger("11"));
//    }
//
//    public static int solution(int n) {
//        String numAsString = getExpValue(n);
//        int oneOccurence = 1;
//        for (int idx = 0; idx < numAsString.length(); idx++) {
//            if (numAsString.charAt(idx) == '1')
//                oneOccurence++;
//
//        }
//        return oneOccurence;
//    }
//}




























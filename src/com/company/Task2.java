package com.company;

import java.util.Scanner;

public class Task2 {
    public static boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 || A[n - 1] != K)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {


        int[] arr = new int[]{1,1,2,2,3};


        int b = 3;
        boolean res = solution(arr,b);
        System.out.println(res);

    }
}

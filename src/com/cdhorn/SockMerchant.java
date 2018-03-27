package com.cdhorn;

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> socks = new HashMap();
        Integer sockPairs = 0;
        for (int i = 0; i<n; i++) {
            Integer count = socks.get(ar[i]);
            if (count == null) {
                socks.put(ar[i], 1);
            } else {
                socks.put(ar[i], count+1);
            }
        }
        for (Integer value : socks.values()) {
            sockPairs += value / 2;
        }
        return sockPairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

}

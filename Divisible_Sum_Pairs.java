/**
Count the pairs of integers within the set S, where S[i] + S[j] is divisible
by k, and i < j. The first line of input is n and k where n is the size of
the set, and k is the divisor for all pairs.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
        int count = 0;
        int i=0;
        int j=1;
        for(i=0;i<ar.length-1;i++){
            for(j=i+1;j<ar.length;j++){
                if((ar[i]+ar[j])%k==0){
                    count ++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}

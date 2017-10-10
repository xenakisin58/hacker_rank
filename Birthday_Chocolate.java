/*
Lily has a chocolate bar consisting of a row of n squares where each square 
has an integer written on it. She wants to share it with Ron for his birthday, 
which falls on month m, and day d. Lily wants to give Ron a piece of chocolate 
only if it contains m consecutive squares whose integers sum to d.

Given m, d, and the sequence of integers written on each square of Lily's 
chocolate bar, how many different ways can Lily break off a piece of chocolate 
to give to Ron?

For example, if m=2, d=3 and the chocolate bar contains n rows of squares 
with the integers [1,2,1,3,2] written on them from left to right, the following diagram 
shows two ways to break off a piece:
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        int result = 0;
        for(int i=0;i<s.length - m + 1; i++){
            int temp_sum=0;
            for(int j=0;j<m;j++){
                temp_sum+=s[j+i];
            }
            if(temp_sum==d){
                result++;
            } 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}

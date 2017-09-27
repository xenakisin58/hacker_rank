/**
Count the number of integers between set A and set B. I.e. if x mod a_i == 0 and b_i % x == 0,
count x as an integer between these two sets
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        int max_a = a[0];//arbitrary starting value
        int min_b = b[0];
        int count=0;
        
        for(int i=0;i<a.length;i++){
            if(a[i]>max_a){
                max_a = a[i];
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i]<min_b){
                min_b = b[i];
            }
        }
        for(int x=max_a;x<=min_b;x++){
            int true_a=1;
            int true_b=1;
            for(int i=0;i<a.length;i++){
                if(x%a[i]!=0){
                    true_a=0;
                }
            }
            for(int i=0;i<b.length;i++){
                if(b[i]%x!=0){
                    true_b=0;
                }
            }
            if(true_a > 0 && true_b > 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}

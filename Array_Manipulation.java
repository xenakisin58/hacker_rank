/**
    You are given a list(1-indexed) of size , initialized with zeroes. You have to perform operations on 
    the list and output the maximum of final values of all the elements in the list. For every operation,
    you are given three integers , and and you have to add value to all the elements ranging from index
    to (both inclusive).
    
    The first line will contain two integers and separated by a single space.
    Next lines will contain three integers , and separated by a single space.
    Numbers in list are numbered from to.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long delta[] = new long[n];
        long max = 0;
        long count =0;
        
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            delta[a-1]+=k;
            if(b < delta.length){
                delta[b]-=k;
            }
        }
        for(int j=0;j<delta.length;j++){
            count+=delta[j];
            max = Math.max(max, count);
        }
        System.out.println(max);
        in.close();
    }
}

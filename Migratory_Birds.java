/**
Return the bird Id (integer in the list) with the greatest frequency.
If there are two or more, return the Id with the smallest value.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int[] counts = new int[n];
        int max_count = 0;
		for (int type : ar) {
			counts[type]++;
            if(max_count < counts[type]){
                max_count = counts[type];
            }
        }
        for(int i=0;;i++){
            if(counts[i]==max_count){
                return i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}

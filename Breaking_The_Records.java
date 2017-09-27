/**
Count the number of times the best and worst (numeric) records are broken.
/*

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int best = 0, worst = 0;
        int [] records = {0,0};
        for(int i=0;i<s.length;i++){
            if(i==0){
                best = worst = s[i];
            }
            else{
                if(s[i] > best){
                    best = s[i];
                    records[0]++;
                }
                if(s[i]<worst){
                    worst = s[i];
                    records[1]++;
                }
            }
        }
        return records;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {
    public static void swap(String[] arr, int pos1, int pos2){
        String temp = new String(arr[pos2]);
        arr[pos2] = arr[pos1];
        arr[pos1] = temp;
    }
    
    public static int strCompAsInts(String s1, String s2){
            if(s1.length() > s2.length()) return 1;
            if(s1.length() < s2.length()) return -1;
            for(int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i) > s2.charAt(i)) return 1;
                if(s1.charAt(i) < s2.charAt(i)) return -1;
            }
            return 0;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int i=0; i < n; i++){
            unsorted[i] = in.next();
        }
        // your code goes here

        Arrays.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) 
            {
                return strCompAsInts(s1,s2);
            }
        });
        
        //print sorted output
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(unsorted[i]+"\n");
        }
        System.out.print(sb);
    }
}

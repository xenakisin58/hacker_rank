import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long max, min, sum=0, arr_max=arr[0], arr_min=arr[0];
        for(int i=0; i<5;i++){
            sum += arr[i];
            if(arr[i] < arr_min){
                arr_min = arr[i];
            }
            if(arr[i] > arr_max){
                arr_max = arr[i];
            }
        }
        min = sum - arr_max;
        max = sum - arr_min;
        System.out.println(min + " " + max);
    }
}

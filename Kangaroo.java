/**
Check if kangaroo1, starting at position x1 and jumping v1 jumps per turn, lands on the same
position as kangaroo2 starting at position x2 and jumping v2 jumps per turn.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        if(x1 > x2 && v1 > v2){return "NO";}
        if(x1 < x2 && v1 < v2){return "NO";}
        int converging = 1;
        while(converging > 0){
            if(x1 == x2){return "YES";}
            else{
                if((x1 > x2 && (x1+v1) < (x2+v2)) || (x1 < x2 && (x1+v1)>(x2+v2))){
                converging = 0;
                }
                x1+=v1;
                x2+=v2;
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}

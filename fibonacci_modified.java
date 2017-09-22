import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int n = sc.nextInt();
        BigInteger b1, b2, result = null;

        b1 = BigInteger.valueOf(t1);
        b2 = BigInteger.valueOf(t2);
        if(n==1){
            System.out.println(b1);
        }
        if(n==2){
            System.out.println(b2);
        }
        else{
            for(int i=2;i<n;i++){
                result = b1.add(b2.pow(2));
                b1 = b2;
                b2 = result;
            }
            System.out.println(result);
        }
    }
}

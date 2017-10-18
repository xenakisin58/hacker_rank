import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length() + B.length();
        System.out.println(len);
        if(A.compareTo(B) >0 ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.print((char)(A.charAt(0)-32)+A.substring(1) + " ");
        System.out.print((char)(B.charAt(0)-32)+B.substring(1));
    }
}

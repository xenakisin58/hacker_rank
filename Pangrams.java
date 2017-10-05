import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        byte[] bitvec = new byte[26];
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toLowerCase();
        input = input.replaceAll("\\s+","");;
        for(short i=0;i<input.length();i++){
            bitvec[input.charAt(i)-97]=1;
        }
        for(byte i=0;i<26;i++){
            if(bitvec[i]==0){
                System.out.print("not pangram");
                return;
            }
        }
        System.out.print("pangram");
    }
}

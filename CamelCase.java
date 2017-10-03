import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if(s.length()>0){
            int num = 1;
            for(int i=0;i<s.length(); i++){
                if((char)s.charAt(i)<'a'){
                    num++;
                }
            }
            System.out.println(num);
        }
        else{
            System.out.println("0");
        }
    }
}

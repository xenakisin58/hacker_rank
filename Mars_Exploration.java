import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int num = 0;
        int remainder = 0;
        if(S.length()%3>0){
            num = S.length()/3+1;
            remainder = S.length()%3;
        }
        else{
            num = S.length()/3;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<num;i++){
            sb.append("SOS");
        }
        if(remainder ==1){
            sb.append("S");
        }
        else if(remainder == 2){
            sb.append("O");
        }
        int count = 0;
        String template = sb.toString();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!=template.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}

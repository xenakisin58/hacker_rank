import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)('a' + ((ch - 'a' + k)%26));
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)('A' + ((ch - 'A' + k)%26));
            }
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}

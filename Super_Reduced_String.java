import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        // Complete this function
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(!stk.isEmpty() && ch == stk.peek()){
                stk.pop();
            }
            else{
                stk.push(ch);
            }
        }
        if(stk.isEmpty()){
            return "Empty String";
        }
        else{
            StringBuilder sb = new StringBuilder();
            for(Character ch : stk){
                sb.append(ch);
            }
            return sb.toString();        
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}

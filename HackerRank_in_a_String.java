import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        queries:
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            Queue<Character> queue = new LinkedList<>();
            for(int i=0; i<s.length(); i++){
                queue.add(s.charAt(i));
            }
            String str = "hackerrank";
            int str_ctr = 0;
            while(!queue.isEmpty()){
                if(queue.peek().equals(str.charAt(str_ctr))){
                    str_ctr++;
                    if(str_ctr == str.length()){
                        System.out.println("YES");
                        continue queries;
                    }
                }
                queue.remove();
            }
            System.out.println("NO");
        }
    }
}

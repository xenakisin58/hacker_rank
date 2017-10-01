import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print 
        output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> max_st = new Stack();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int type = sc.nextInt();
            switch(type){
                case 1:
                    int curr = sc.nextInt();
                    st.push(curr);
                    if(max_st.isEmpty() || curr >=max_st.peek()){
                        max_st.push(curr);
                    }
                    break;
                    
                case 2:
                    int temp = st.pop();
                    if(max_st.peek() == temp){
                        max_st.pop();
                    }
                    break;
                    
                case 3:
                    System.out.println(max_st.peek());
                    break;
            }
        }
    }
}

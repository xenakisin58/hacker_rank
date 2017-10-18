import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //LinkedList<String> list = new LinkedList<String>();
        String s = scan.nextLine();        
        // Write your code here.
        scan.close();
        s = s.trim();
        if(s.length() == 0){
            System.out.println("0");
            return;
        }
            
        String[] arr = s.split("[^a-zA-Z]+");
        System.out.println(arr.length);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

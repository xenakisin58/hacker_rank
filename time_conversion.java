import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        if(s.contains("PM")){
            String[] times = s.replace("PM","").split(":");
            Integer hour = Integer.valueOf(times[0]);
            if(hour<12){
                times[0]=Integer.valueOf(hour+12).toString();
            }
            return times[0]+":"+times[1]+":"+times[2];
        }
        else{
            String[] times = s.replace("AM","").split(":");
            Integer hour = Integer.valueOf(times[0]);
            if(hour == 12){
                times[0]="00";
            }
            return times[0]+":"+times[1]+":"+times[2];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

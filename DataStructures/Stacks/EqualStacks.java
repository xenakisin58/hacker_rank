import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1=0, h2=0, h3=0;
        int s1[] = new int[n1];
        for(int i=0; i < n1; i++){
            s1[i] = in.nextInt();
            h1 += s1[i];
        }
        int s2[] = new int[n2];
        for(int i=0; i < n2; i++){
            s2[i] = in.nextInt();
            h2 += s2[i];
        }
        int s3[] = new int[n3];
        for(int i=0; i < n3; i++){
            s3[i] = in.nextInt();
            h3 += s3[i];
        }
        
        boolean equalHeight=false;
        if(h1 == h2 && h2 == h3){
            equalHeight=true;
        }
        
        int r1=0, r2=0, r3=0;
        while(!equalHeight){
            if(h1>=h2 && h1 >= h3){
                h1-=s1[r1];
                r1++;
            }
            else if(h2>=h1 && h2 >= h3){
                h2-=s2[r2];
                r2++;
            }
            else if(h3>=h1 && h3 >= h2){
                h3-=s3[r3];
                r3++;
            }
            if((h1 == h2 && h2 == h3) || (h1 == 0 && h2==0 && h3==0)){
                equalHeight=true;
            }
        }
        System.out.println(h1);
    }
}

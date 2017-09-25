/**
Count the number of apples and oranges that fall between the property lines of the house.
First two ints are the east and west side of the property.
Third and Fourth ints are the locations of the apple tree and orange tree, respectively
Fifth and Sixth are the number of apples and oranges that will fall, respectively
Then read in the apple locations and finally the orange locations
Output the number of apples that fall on the property on the first line
Output the number of oranges that fall on the property on the second line
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt() + a;
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt() + b;
        }
        int count_a=0, count_b=0;
        for(int i=0;i<apple.length;i++){
            if(apple[i] >= s && apple[i] <= t){
                count_a++;
            }
        }
        System.out.println(count_a);
        for(int i=0;i<orange.length;i++){
            if(orange[i] >= s && orange[i] <= t){
                count_b++;
            }
        }
        System.out.println(count_b);
    }
}

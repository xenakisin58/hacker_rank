import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/* NB This exercise expects specific text output and will not accept other
normal STDOUT output of error messages for the same exceptions.
*/
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
        Your class should be named Solution. 
        */
        Scanner sc = new Scanner(System.in);
        try{
            int x = sc.nextInt();
            try{
                int y = sc.nextInt();
                if(y==0){
                    ArithmeticException e3 = new ArithmeticException();
                    System.out.print(e3+": / by zero");
                }
                else{
                    System.out.println(x/y);
                }
            }
            catch(InputMismatchException e2){System.out.print("java.util.InputMismatchException");}
        }
        catch (InputMismatchException e1){System.out.print("java.util.InputMismatchException");}
    }
}

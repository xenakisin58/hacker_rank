import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        List<Integer>[] lists = new List[n];
        for (int n_i = 0; n_i < n; n_i++) {
            lists[n_i] = new ArrayList<>();
        }
        int last_ans = 0;
        for(int i=0;i<q;i++){
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            List<Integer> list = lists[(x^last_ans)%n];
            if(t==1){
                list.add(y);
            }
            else{
                last_ans = list.get(y % list.size());
                System.out.println(last_ans);
            }
        }
    }
}

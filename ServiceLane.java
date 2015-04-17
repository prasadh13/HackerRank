import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    public static void largestVehicalPass(int[] width, int entry, int exit) {
        int _smallest = width[entry];
        for(int i = entry+1; i <= exit; i++) {
            if(width[i] < _smallest) {
                _smallest = width[i];
                
            }
        }
        System.out.println(_smallest);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int _freeway_len = sc.nextInt();
        int _num_testcases = sc.nextInt();
        
        
        //System.out.println(_freeway_len);
        //System.out.println(_num_testcases);
        
        int _width_highway[] = new int[_freeway_len];
        for(int i = 0; i < _freeway_len; i++) {
            _width_highway[i] = sc.nextInt();
        }
        for(int j = 0; j < _num_testcases; j++) {
            int _entry = sc.nextInt();
            int _exit = sc.nextInt();
            //System.out.println(_entry);
            //System.out.println(_exit);
            largestVehicalPass(_width_highway, _entry, _exit);
        }
    }
}
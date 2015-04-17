import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void timeToWords(int hrs, int min) {
        
        StringBuilder _timeInWords = new StringBuilder();
        
        String[] _hrsOnly = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
        
        String[] _minutesOnly = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen",
                              "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
                             
        String[] _minutesAfter = {"o' clock","past","to","minute","half","quarter","minutes"};
        
        if(min > 0) {
            if(min == 1) {
                String _time = "one minute past " + _hrsOnly[hrs-1];
                System.out.println(_time);
            }
            else
                if(min == 30) {
                String _time = _minutesAfter[4]+" "+_minutesAfter[1]+" "+ _hrsOnly[hrs-1];
                System.out.println(_time);
            }
            else
                if (min == 45) {
                String _time = _minutesAfter[5]+" "+_minutesAfter[2]+" "+ _hrsOnly[hrs];
                System.out.println(_time);
            }
            else
                 if (min == 15) {
                String _time = _minutesAfter[5]+" "+_minutesAfter[1]+" "+ _hrsOnly[hrs-1];
                System.out.println(_time);
            }
            else
                if (min <= 29) {
                    if(min <= 20) {
                        String _time = _minutesOnly[min-1]+" "+_minutesAfter[6]+" "+_minutesAfter[1]+" "+ _hrsOnly[hrs-1];
                        System.out.println(_time);
                    }
                else {
                    int unit = min % 10;
                    String _time = _minutesOnly[19]+" "+_minutesOnly[unit-1]+" "+_minutesAfter[6]+" "+_minutesAfter[1]+" "+ _hrsOnly[hrs-1];
                        System.out.println(_time);
                }
            }
            else {
                int difference = 60 - min;
                if(difference <= 20) {
                    if(difference < 15) {
                        String _time = _minutesOnly[difference-1]+" "+_minutesAfter[6]+" "+_minutesAfter[2]+" "+ _hrsOnly[hrs];
                        System.out.println(_time);
                    }
                    else {
                        String _time = _minutesOnly[difference-1]+" "+_minutesAfter[6]+" "+_minutesAfter[1]+" "+ _hrsOnly[hrs-1];
                        System.out.println(_time);
                         }
                    }
                else {
                    int unit = min % 10;
                    String _time = _minutesOnly[19]+" "+_minutesOnly[unit-1]+" "+_minutesAfter[6]+" "+_minutesAfter[2]+" "+ _hrsOnly[hrs];
                        System.out.println(_time);
                }
                
            }
        } 
        else {
            String _time = _hrsOnly[hrs-1] +" "+ _minutesAfter[0];
            System.out.println(_time);
            
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int _hrs = sc.nextInt();
        int _min = sc.nextInt();
        
        //calling the dictionary
        timeToWords(_hrs, _min);
    }
}
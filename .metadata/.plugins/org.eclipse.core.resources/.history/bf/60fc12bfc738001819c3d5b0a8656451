package Java.String.SubString_Comparision;

import java.util.Scanner;

public class Solution {
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        for (int i = 0; i < s.length() - k + 1; i++) {
        String word = s.substring(i, i+k);
       // System.out.println(word);  
        if (smallest.isEmpty() || smallest.compareTo(word) >= 0) {
            smallest = word;
        }
        if (largest.isEmpty() || largest.compareTo(word) <= 0) {
            largest = word;
        }
    }   
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

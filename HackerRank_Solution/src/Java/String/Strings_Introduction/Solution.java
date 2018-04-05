package Java.String.Strings_Introduction;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
    	
    	
    /*	Given two strings of lower case English letters, A and B, perform the following operations:

    		Sum the lengths of A and B.
    		Determine if A is lexicographically larger than B (i.e.: A does  come before B in the dictionary?).
    		Capitalize the first letter in A and B and print them on a single line, separated by a space.
    	*/
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
       
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        //System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
    }
}

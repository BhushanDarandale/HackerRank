package Java.String.StringReverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
     for(int i =A.length()-1; i>=0; i--){
         B=B.concat(A.charAt(i)+"");
     }
     if(A.equals(B)){
    	 System.out.println("Yes");
     }else
     {
    	 System.out.println("No");
     }
     
     
     //or
     
  /*   System.out.println( A.equals( new StringBuilder(A).reverse().toString()) 
    		    ? "Yes" : "No" );*/
        
    }
}

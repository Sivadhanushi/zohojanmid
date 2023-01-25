package zohoassess;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Maths {

	public static void main(String[] args) {
             Scanner in = new Scanner(System.in);
             String str = s.next.CharAt();
             int n = str.length();
             int openbracket =0;
             int closebracket =0;
             int operator =0;
             for(int i =0;i<n;i++)
            	 if(str.charAt(i)== '{') {
            		 openbracket++;
            	 }
            	 else if (str.charAt(i)=='}') {
            		 closebracket++;
            	 }
            	 else if(str.charAt(n-2)== '*' || str.charAt(n-2)=='+') {
            		 operator++;
            	 }
            	 }
             
            	 System.out.println("Valid");
            
            	 System.out.println("Invalid");
	}

}

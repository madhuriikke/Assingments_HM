
/*Given array of string check whether all the elements contains only digits not any alaphabets.
if condn satisfied print 1 else -1.
Input:{"123","23.14","522"}
output:1

Input1:{"asd","123","42.20"}
output:-1*/

package Assingment4;

import java.util.Scanner;

public class Assing {
	public static void main(String[] args) {
	 String str = " ";
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter the size of array ");
	 int input =sc.nextInt();
	 System.out.println("Enter the element array");
	 String array[]=new String [input];
     for(int i=0;i<input;i++) {
    	 array[i]=sc.next();
    	
    		 for (int j = 0; j < array.length; j++) {

    				str = str + array[j];
    			}
    			System.out.println(str);
    			if (str.matches("[0-9]+")) {
    				System.out.println("1");
    			} else {
    				System.out.println("-1");
    			}

    		 
    	 }
    	 
     }
}

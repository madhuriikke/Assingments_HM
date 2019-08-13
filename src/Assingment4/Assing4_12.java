/*String a="a very fine day"
output:A Very Fine Day*/

package Assingment4;

import java.util.Scanner;

public class Assing4_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entet the String");
        String input=sc.nextLine();
        
        String[] split=input.split(" ");
        for(int i=0;i<split.length;i++) {
        	System.out.print(split[i].substring(0, 1).toUpperCase() + split[i].substring(1, split[i].length()) + " ");
        }
	}

}

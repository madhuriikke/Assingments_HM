/*find the no.of charcters,that has repeated 3 consecutive times
input1:"aaabbccc"
ouput1=2;*/
package Assingment4;

import java.util.Scanner;

public class Assing4_9 {
//update
	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String input=sc.nextLine();
		
		char[] ch=input.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			for(int j=i+1;j<ch.length;j++){
			
		    if(ch[i]==ch[j]&&ch[i]==ch[j+1]) {
		        System.out.println(ch[i]);
		    }
			}
		}
		
	}

}

/*Given array of intergers,print the sum of elements sqaring/cubing as per the power of their indices.         
//answer=  sum=sum+a[i]^i;
     eg:input:{2,3,5}
	Output:29*/

package Assingment4;

import java.util.Scanner;

public class Assing4_2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of int array: ");
		int input=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int array[]= new int[input];
		for(int i=0;i<input;i++){
			array[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int j=0;j<array.length;j++){
			sum=sum+array[j]^j;
		}
	System.out.println("Sum is : "+sum);

	}

}

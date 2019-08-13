import java.util.Scanner;

/*1. A number is given as input. Find the odd digits in the number, add them and find if the sum is odd or not.if even return -1, if odd return 1
input:52315
logic:5+3+1+5=14(even)
output:-1
input:1112
logic:1+1+1=3(odd)
output:1*/

public class Assing1_1 {
	public static int SumOfOddEven(int n) {//int is return type
		int n1, n2 = 0, n3;
		while (n != 0) {//true cond(52315!=0)|| false(0!=0)
			n1 = n % 10;// getting last char or int from string  
			//System.out.println(n1);
			if (n1 % 2 != 0)//if cond is true then entered other wise n/=10
			n2=	n2 + n1;
			n =n / 10;
			System.out.println(n);
		}
		if (n2 % 2 == 0)
			n3 = -1;
		else
			n3 = 1;
		return n3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println(SumOfOddEven(n));//fuction call 
		sc.close();

	}
}

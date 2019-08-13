package Assingment4;

/*Square root calculation of
((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
o/p should be rounded of to int;*/

public class Assing4_20 {

	public static void main(String[] args) {

		int x1=10;		int y1=5;
		int x2=20;		int y2=7;
		
		double no=(((x1+y1)*(x1+y1))+((x2+y2)*(x2+y2)));
		
		double d=Math.sqrt(no);
		int no1=(int) d;
		
		System.out.println(no1); 

	}

}

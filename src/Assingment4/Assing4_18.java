//String[] input1=["Vikas","Lokesh",Ashok]
// expected output String: "Vikas,Lokesh,Ashok"

package Assingment4;

public class Assing4_18 {

	public static void main(String[] args) {
		String[] input1 = { "Vikas", "Lokesh", "Ashok"};
		String s;

		
		for (int i = 0; i < input1.length; i++) {
			s=input1[i];
			System.out.print(s);
			
			for(int j =i+1;j<=input1.length-1;j++) {
				System.out.print(",");
				break;
			}
		}
			

	}
}

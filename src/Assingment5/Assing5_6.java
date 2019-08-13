package Assingment5;
/*int[] input={2,1,4,1,2,3,6};
check whether the input has the sequence of "1,2,3". if so-
output=true;
int[] input={1,2,1,3,4,5,8};
output=false*/

public class Assing5_6 {

	public static void main(String[] args) {

		int[] input = { 1, 3, 4, 5, 6, 7 };

		String n = "12,34";
		String n1 = " ";
		for (int i = 0; i < input.length; i++) 
		    {
			n1 = n1 + input[i];
		    }
			
				if (n1.contains(n)) 
				{
					System.out.println(true);
				} else 
				{
					System.out.println(false);
				}
			}

		}
	

//-----------------------------------------------------------------------
		/*String s = "";
		String s1 = "1,2,3";
		int patten = input.length - 1;
		for (int i = 0; i < input.length; i++) {
			s = s + input[i];
			if (patten > 0) {
				s = s + ",";
				patten--;
			}
		}
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.startsWith(s1, i)) {
				System.out.println("true");
				count++;
			}
		}
		if (count != 1) {
			System.out.println("false");
		}

	}
}*/
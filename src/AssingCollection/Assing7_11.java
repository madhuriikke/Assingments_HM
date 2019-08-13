package AssingCollection;
//update range
public class Assing7_11 {
	// Retrieve the non-prime numbers within the range of a given input. Add-up the
	// non-prime numbers and return the result.

	public static void main(String[] args) {
		
		int no1 = 5;
		int ans= 0 ;
		
		for(int no=1;no<=no1;no++)
		{
			int count=0;
			for(int j=2;j<no;j++)
			{
				if(no%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				ans = ans + no;
			}
		}System.out.println(ans);
		

	}

}

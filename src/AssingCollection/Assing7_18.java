package AssingCollection;

/*input1=1 ,input2=2 ,input3=3 --- output=6;
input1=1 ,input2=13,input3=3 --- output=1;
input1=13,input2=2 ,input3=8 --- output=8;
if value equal to 13,escape the value '13', as well as the next value to 13.
sum the remaining values
*/
public class Assing7_18 {

	public static void main(String[] args) {

		int n1=13;		int n2=2;		int n3=8;
		int ans = 0 ;

		if(n1==13)
		{
			ans = ans + n3;
		}
		else if(n2==13)
		{
			ans = ans + n1;
		}
		else if(n3==13)
		{
			ans =n1 + n2;
		}
		else
		{
			ans = n1 + n2 + n3;
		}System.out.println(ans);
			
		
		
		
		
		
	}

}

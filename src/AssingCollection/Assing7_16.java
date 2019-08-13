package AssingCollection;
//not done
/*Input1={“ABX”,”ac”,”acd”};
Input2=3;
Output1=X$d
not done
*/
public class Assing7_16 {
	String a[]={"ABX","ac","acd"};		String ans = "";
	int input2 =3;
	{

	for(int i=0;i<a.length;i++)
	{
		String n = a[i];
		if(n.length()==input2)
		{
			ans = ans + n.charAt(2);
		}
		else
		{
			ans = ans + "$";
		}
	}
	System.out.println(ans);
	
}
}
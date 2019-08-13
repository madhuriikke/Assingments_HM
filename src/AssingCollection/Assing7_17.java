package AssingCollection;

public class Assing7_17 {
	/*
	 * String[] input={"100","111","10100","10","1111"} input2="10" output=2;count
	 * strings having prefix"10" but "10" not included in count operation-- for how
	 * many strings input2 matches the prefix of each string in input1
	 */
	public static void main(String[] args) {
//prifix is Starts with 
		//sufix is end withs
		String a[]={"100","111","10100","10","1111"};	
		String n = "10";  int count = 0 ;
		
		for(int i=0;i<a.length;i++)
		{
			String j = a[i];
			
			if((j.startsWith(n) && (j.length()!=2)))
				{
					count++;
				}
		}
		System.out.println(count);
		

	}

}

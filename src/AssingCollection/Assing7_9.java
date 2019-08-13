package AssingCollection;

public class Assing7_9 {
	/*
	 * An array of integers is given.The given element is removed new array is
	 * returned. input1:{10,10,20,30,76} output: {20,20,76}(10 is asked to remove)
	 */
	public static void main(String[] args) {
		

		int n[]={10,10,20,30,76};
		int no= 10;
		
		int n1[] = new int[n.length];
		int j = 0 ;
		
		for(int i=0;i<n.length;i++)
		{
			if(no!=n[i])
			{
				n1[j]=n[i];
				j++;
			}
		}
		
		for(int i=0;i<j;i++)
		{
			System.out.print(n1[i]+" ");
		}
	}

}

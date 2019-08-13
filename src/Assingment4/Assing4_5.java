/*Given an array find the largest 'span'(span is the number of elements between two same digits)
    find their sum.
	a[]={1,4,2,1,4,1,5}
	Largest span=5
*/

package Assingment4;

public class Assing4_5 {
	
	private static final int maxspam = 0;

	public int maxspan(int[]array) {
		int maxspan=0;
		int tempspan=0;
		{
			if(array.length==0) {
				return 0;
			}
			for(int i=0;i<array.length;i++) {
				for(int j=array.length-1;j>1;j--) {
					if(array[i]==array[j]) {
						tempspan = j-i ;
							break;
						}
						
					}
					if(tempspan > maxspan) {
						maxspan=tempspan;
						
					}
				}
			return maxspan;
			}
		}
		
		
	

	public static void main(String[] args) {
         
		int a[]={1,4,2,1,4,1,5};
		Assing4_5  as = new Assing4_5();
		System.out.println(as.maxspan(a));
		
	}

}

/*arraylist1={ 1,2,3,4,5}
    arraylist2={ 6,7,8,9,10}
size of both list should be same 
output={6,2,8,4,10}
*/

package Assingment4;

public class Assing4_7 {

	public static void main(String[] args) {

		int arraylist1[]={ 1,2,3,4,5};
		int arraylist2[]={ 6,7,8,9,10};
		//System.out.println(arraylist1.length);
		//System.out.println(arraylist2.length);
		
		
		if(arraylist1.length==arraylist2.length){
			for(int i=0;i<arraylist2.length;i++){
				if(i%2==0){
					System.out.print(arraylist2[i]+" ");
					
				}
			}
			System.out.println("");
			for(int j=0;j<arraylist1.length;j++){
				if(j%2!=0){
					System.out.print(arraylist1[j]+" ");
					
				}
			}
		}
		
}
}

//Retrieve the max from array which is in a odd-index



package Assingment3;

public class Assing3_29 {

	/*
	 * public int getIndexOfMax(int array[]) { if (array.length == 0) { return -1; }
	 */
	    
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6};
		int max =array[0];
		int pos =0;
		System.out.println(array.length);
		for(int i=0; i<array.length; i++) {
	        if (max < array[i]) {
	            pos = i;
	            max = array[i];
	        }
	    }
	    System.out.println("max value index:" +pos);
	    
	    System.out.println("max value:" +max);

	}

}

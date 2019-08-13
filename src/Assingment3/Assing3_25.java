// find the average of the maximum and minimum number in an integer array

package Assingment3;

public class Assing3_25 {

	public static void main(String[] args) {
		
		int array[] =new int[]{1,2,34,567,43,46,89};
		
		int max =getMax(array);
		System.out.println("Maximum value is:" +max);
		
		int min =getMin(array);
		System.out.println("Minimum value is:" +min);
	}
		

		 public static int getMax(int[] inputArray){ 
			    int maxValue = inputArray[0]; 
			    for(int i=1;i < inputArray.length;i++){ 
			      if(inputArray[i] > maxValue){ 
			         maxValue = inputArray[i]; 
			      } 
			    } 
			    return maxValue; 
			  }
			 
			  // Method for getting the minimum value
			  public static int getMin(int[] inputArray){ 
			    int minValue = inputArray[0]; 
			    for(int i=1;i<inputArray.length;i++){ 
			      if(inputArray[i] < minValue){ 
			        minValue = inputArray[i]; 
			      } 
			    } 
			    return minValue; 
	}

}

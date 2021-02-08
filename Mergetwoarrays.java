package assignment2;

import java.util.Arrays;

public class Mergetwoarrays {
	
	public static void main(String[] args)   
	{  
	int arr1 []= {10,44,12,38,4,40,1};       
	int arr2 []= {70,12,55,98,22,56,39};    
	int a = arr1.length;         
	int b = arr2.length;    
	int merge[] = new int[a + b];  
	System.arraycopy(arr1, 0, merge, 0, a);  
	System.arraycopy(arr2, 0, merge, a, b);  
	System.out.println(Arrays.toString(merge));   
	
	}  
	 

}

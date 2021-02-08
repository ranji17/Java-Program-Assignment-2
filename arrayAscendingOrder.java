package assignment2;

public class arrayAscendingOrder {
	public static void main (String args[]) {
		int arr[] = new int [] {8, 1, 5, 2, 9, 4, 3, 2, 7};     
		int temp = 0;    
		    
		System.out.println("Given Array : ");    
		for (int i = 0; i < arr.length; i++) {     
		    System.out.print(arr[i] + " ");    
		}    
		    

		for (int i = 0; i < arr.length; i++) {     
		    for (int j = i+1; j < arr.length; j++) {     
		       if(arr[i] > arr[j]) {    
		           temp = arr[i];    
		           arr[i] = arr[j];    
		           arr[j] = temp;    
		       }     
		    }     
		}    
		  
		System.out.println();    
		    

		System.out.println("Array sorted in ascending order: ");    
		for (int i = 0; i < arr.length; i++) {     
		    System.out.print(arr[i] + " ");    
		}    
		
	}

}

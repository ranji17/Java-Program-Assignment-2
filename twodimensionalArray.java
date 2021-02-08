package assignment2;

public class twodimensionalArray {
	public static void main(String args[]){  
		
		int first[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int second[][]={{1,3,4},{2,4,3},{1,2,4}};    
		    
		
		int add[][]=new int[3][3];  
		    
		
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		add[i][j]=first[i][j]+second[i][j];    
		System.out.print(add[i][j]+" ");    
		}    
		System.out.println();  
		}    
		}

}

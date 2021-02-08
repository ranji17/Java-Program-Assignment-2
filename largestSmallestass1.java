package assignment2;
import java.util.Scanner;

public class largestSmallestass1 {
	
	
	public static void main (String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.print("how many elements you want:");
	            int n = s.nextInt();

		int arr[] = new int[n];
	            System.out.println("GIVE ARRAY ELEMENTS:");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = s.nextInt();
		}

		int larg1, larg2, temp;

		larg1 = arr[0];
		larg2 = arr[1];

		if (larg1 < larg2)
		{
			temp = larg1;
			larg1 = larg2;
			larg2 = temp;
		}

		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] > larg1)
			{
				larg2 = larg1;
				larg1 = arr[i];
			}
			else if (arr[i] > larg2 && arr[i] != larg1)
			{
				larg2 = arr[i];
			}
		}
		
		System.out.println ("LARGEST NUMBER 1 IS  " + larg1);
		System.out.println ("LARGEST NUMBER 2 IS " + larg2);
		

	}
	

}

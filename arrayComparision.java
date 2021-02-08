package assignment2;

public class arrayComparision {
	public static void main(String[] args) {
        int num[] = {4, 7, 5, 2, 1};
        int toFind = 7;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + " is found .");
        else
            System.out.println(" -1 ");
    }
}




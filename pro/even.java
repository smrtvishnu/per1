import java.util.Scanner;

public class OddInEvenInOdd {

	public void getOddEven() {
		
		int arraySize;
		int count,i;		

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of numbers");

		arraySize = sc.nextInt();
		int[] numArray = new int[arraySize];		

		System.out.println("enter the numbers");

		for (count = 0; count <= arraySize - 1 ; count++) {
			numArray[count] = sc.nextInt();			
		}
		sc.close();
		
			for (i = 0; i <= numArray.length -1 ; i++) {
				if(i % 2 == 0) {
					if(numArray[i] % 2 != 0) {
						System.out.println(numArray[i]);
					} else {}
				} else {
					if (numArray[i] % 2 == 0) {
						System.out.println(numArray[i]);
					}
				}				
			}
	}
	public static void main(String[] args) {		
		
		OddInEvenInOdd instance = new OddInEvenInOdd();		                  		
		instance.getOddEven();
	}

}

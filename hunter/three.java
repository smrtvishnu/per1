import java.util.*;
public class NearestNumbersWithLeastDiffernce {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int []arr=new int[n];
		for(int loopVar=0;loopVar<n;loopVar++) {
			arr[loopVar]=scan.nextInt();
		}
		for(int loopVar=0;loopVar<n;loopVar++) {
			for(int loopVar1=0;loopVar<n;loopVar++) {
			if((k==arr[loopVar]+1)||(k==arr[loopVar]+2)) {
				System.out.print(arr[loopVar]+" ");
			}
			if(((arr[loopVar]-k==1))){
				System.out.print(arr[loopVar]+" ");
			}
			}
		}
		
		scan.close();
	}
}

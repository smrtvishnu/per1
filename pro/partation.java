public class main
{	
	public static void main (String[] args) 
    {
		int n,a,b;
		System.out.println("Please enter number");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Please enter A and B");
		a=s.nextInt();
		b=s.nextInt();		
		int c=(a+b)*2;
		if(n%c==0):
			System.out.println("YES");
		else:
			System.out.println("NO");

    }
}

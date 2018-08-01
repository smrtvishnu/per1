import java.util.*;
class Change
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String X=sc.nextLine();
        String Y=sc.nextLine();
        int M=X.length();
        int N=Y.length();
        int O[][] = new int[M+1][N+1];
        for (int i=0; i<=M; i++)
        {
            for (int j=0; j<=N; j++)
            {
                
                if (j==0)
                    O[i][j] = i;                  										     
                else if (i==0)
                    O[i][j] = j; 
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    O[i][j] = O[i-1][j-1];
                else
                    O[i][j] = 1 + min(O[i-1][j-1],O[i-1][j],O[i][j-1]);
            }
        }
        System.out.println(O[M][N] );
    }
    static int min(int x,int y,int z)
    {
        if (x <= y && x <= z) 
        	return x;
        if (y <= x && y <= z) 
        	return y;
        else 
        	return z;
    }
}

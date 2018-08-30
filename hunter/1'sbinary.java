package binaryrnge;
import java.util.*;
public class Binaryrnge {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
       int b=scan.nextInt();
       int cot=0;
        for(int i=a;i<b;i++)
        {
            int count=0,c=0,m=0,l=0;
            l=i;
            while(l>0)
            {
                c=l%2;
                if(c==1)
                {
                    count++;
                }
                l=l/2;  
                
            }
           
            
            for(int k=2;k<count;k++)
            {
                if((count%k)==0)
                {
                    m++;
                }
                 
            }
            if(m==0)
            {
            cot++;
            }
        }
        System.out.println(cot);
         
        
        
    }
    
}

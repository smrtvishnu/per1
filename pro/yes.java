import java.util.*;
public class set1_10 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=in.nextInt();
        }
        int flag1=0;
        for(int i=0;i<m;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr2[i]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                flag1=1;
                break;
            }
        }
        if(flag1==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
       
        
    }
}

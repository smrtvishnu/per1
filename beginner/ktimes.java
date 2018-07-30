import java.util.Scanner;
class count{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
        String sent=s.nextLine();
        int len = sent.length();
        int arr[]=new int[len];
        int count=1;
        char ch[] = new char[len];
        for(int i = 0; i <= len-1; i ++)
        {
            ch[i] = sent.charAt(i);

        }
        for(int j= 0;j<=len-1;j++){
            for(int k=0;k<=len-1;k++){
                if(ch[j]==ch[k]){
                    arr[j]= count++;
                }
            }
        }

        int max=arr[0];
        for(int z=1;z<=len-1;z++){
            if(count>max)
                max=count;
        }
        System.out.println(max);
        System.out.println("The character that appears the most number of times is "  +arr[max]);
    }
}

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n, a=0,b=1,c=0, i;
        System.out.print("enter number of terms");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(i<=1)
            {
                c=i;
            }
            else
            {
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c+" ");

        }
    }
    
}

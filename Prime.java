import java.util.Scanner;
public class Prime {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n, i, count=0;
        System.out.print("enter number");
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println(n+" is not prime");
        }
        else
        {
            System.out.println(n+" is prime");
        }
    }
    
}

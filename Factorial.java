import java.util.*;
public class Factorial {
    public static void main(String[]args)
    {
        int n, i, fact=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
    
}

import java.util.*;
public class Palindrome {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,dup=0, reve=0, rem=0;
        n=sc.nextInt();
        dup=n;
        while(n!=0)
        {
            rem=n%10;
            reve=reve*10+rem;
            n=n/10;
        }
        if(reve==dup)
        {
            System.out.println(dup+" is a Palindrome number");
        }
        else
        {
            System.out.println(dup+" is not a Palindrome number");
        }
    }
    
}

import java.util.Scanner;
public class Armstrong {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n ,dup=0, result=0, rem=0;
        n=sc.nextInt();
        dup=n;
        while(n!=0)
        {
            rem=n%10;
            result=result+(int)Math.pow(rem, 3);
            n=n/10;
        }
        if(result==dup)
        {
            System.out.println(dup+" is an Armstrong number");
        }
        else
        {
            System.out.println(dup+" is not an Armstrong number");
        }
    }
    
}

import java.util.*;
public class Pattern {
    public static void main(String[]args)
    {
        int i, j, n;
        char x='*';
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    
}

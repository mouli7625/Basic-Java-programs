import java.util.Scanner;
public class Matrix_Multiplication 
{
    public static void main(String[]args)
    {
        Scanner scanner =new Scanner(System.in);
        int n, i,j,k;
        int a[][], b[][], mul[][];
        n=scanner.nextInt();
        a=new int[n][n];
        b=new int[n][n];
        mul=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=scanner.nextInt();
                b[i][j]=scanner.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                mul[i][j]=0;
                for(k=0;k<n;k++)
                {
                    mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(mul[i][j]);
            }
            System.out.println();
        }

    }
    
}

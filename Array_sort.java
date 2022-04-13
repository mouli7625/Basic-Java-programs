import java.util.Scanner;
import java.util.Arrays;
public class Array_sort {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n, i;
        int a[];
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array before sorting ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Arrays.sort(a);
        System.out.println("Array after sorting ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    
}

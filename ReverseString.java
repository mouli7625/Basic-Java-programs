import java.util.Scanner;
 class ReverseString
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
      String s, z="";
      int i,len;
      System.out.print("Enter the  String ");
      s=sc.next();
      len=s.length();
      for(i=len-1;i>=0;i--)
      {
          z=z+s.charAt(i);
      }

        System.out.print("Reverse of String "+s+" is "+z);
    }
}
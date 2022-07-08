public class repeating_elements {
    public static void main(String args[]) {
        int a[]={1,1,2,2,3};
        int dup[]=new int[5];
        int i,j,cnt=0;
        for(i=0;i<a.length-1;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    dup[cnt]=a[i];cnt++;
                }
            }
        }
        for(i=0;i<cnt;i++)
        {
            if(dup[i]!=dup[i+1])
            {
                System.out.print(dup[i]+" ");
            }
        }
    }

    
}

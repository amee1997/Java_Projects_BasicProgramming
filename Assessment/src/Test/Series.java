package Test;

import java.util.*;
public class Series
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,n,sum=0;
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                sum+=j;
            }
        }
        System.out.println(sum);
    }
}
 
package Test;

import java.util.Scanner;
public class AlphabeticalOrder
{
    public static void main(String[] args)
    {
        String temp;
        Scanner SC = new Scanner(System.in);
        int N= SC.nextInt();
        SC.nextLine(); 
        String names[] = new String[N];
        for(int i=0; i<N; i++)
        {
            names[i] = SC.nextLine();
        }
        for(int i=0; i<N; i++)
        {
            for(int j=1; j<N; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            System.out.println(names[i]);
        }
    }
}
 
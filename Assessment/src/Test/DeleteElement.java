package Test;

import java.util.Scanner;
public class DeleteElement
{
   public static void main(String args[])
   {
       int size, i, del, count=0;
       Scanner scan = new Scanner(System.in);
       int arr[] = new int[50];
       size = scan.nextInt();
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
       del = scan.nextInt();
       for(i=0; i<size; i++)
       {
           if(arr[i] == del)
           {
               for(int j=i; j<(size-1); j++)
               {
                   arr[j] = arr[j+1];
               }
               count++;
               break;
           }
       }
       if(count==0)
       {
           System.out.print("Element Not Found");
       }
       else
       {
           for(i=0; i<(size-1); i++)
           {
               System.out.print(arr[i]+ " ");
           }
       }
   }
}
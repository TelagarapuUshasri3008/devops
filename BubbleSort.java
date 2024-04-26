import java.io.*;
import java.util.*;
class BubbleSortDemo
{
   public static void Bubble(int a[],int n)
   {
       int i,j,temp;
       for(i=0;i<n;i++)
       {
          for(j=i+1;j<n;j++)
          {
              if(a[i]>a[j])
              {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
          }
       }
    }
}
class BubbleSort
{
    int i,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array: ");
    n=sc.nextInt();
    System.out.println("Enter elements into the array: ");
    for(i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
    }
    System.out.println("Enter elements after sorting: ");
    BubbleSort.Bubble(a,n)
    for(i=0;i<n;i++)
    {
       System.out.println("a[i] ");
    }
}
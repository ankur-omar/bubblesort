import java.util.Scanner;
public class Bubble {
    public static void main(String[] args)
    {
          int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
       int a[]  = new int[n];
       System.out.println("enter the array elements");
       for(int i=0;i<a.length;i++)
           a[i] = sc.nextInt();
       for(int i=0;i<a.length;i++)
       {
           int flag =0;

           for(int j=0;j<a.length-1-i;j++)
           {
               if(a[j]>a[j+1])
               {
                   temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                   flag =1;

               }
           }
           if(flag==0)
           {
               break;
           }


       }
       System.out.println("After sort the array");
       for(int i=0;i<a.length;i++)
       {
           System.out.println(a[i]+"");
       }

    }
}

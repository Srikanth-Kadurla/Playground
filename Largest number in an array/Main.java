import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int max=0,as=sc.nextInt();
      int arr[]=new int[as];
      
      for(int i=0;i<as;i++)
      {
        arr[i]=sc.nextInt();
        if(arr[i]>max)
          max=arr[i];
      }
      System.out.print(max);
      
      
      
    }
}
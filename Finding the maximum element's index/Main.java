import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int as=sc.nextInt();
    int arr[]= new int[as];
    int i,max,maxi=0;
    for(i=0;i<as;i++)
    {
      arr[i]=sc.nextInt();
    }
    max=arr[0];
    for(i=0;i<as;i++)
    {
      if(arr[i]>=max)
      {
        maxi=i;
      max=arr[i];
      }
    }
    System.out.print(maxi);
  }
}
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int as=s.nextInt();
      int arr[]=new int[as];
      int i;
      
      
      
      
      for(i=0;i<as;i++)
      {
        arr[i]=s.nextInt();
      }
      
      int s1=s.nextInt();
      int s2=s.nextInt();
      int s1i=0,s2i=0;
      
      
      for(i=0;i<as;i++)
      {
        if(arr[i]==s1)
        {
          
          System.out.println(i);
          s1i=1;
        }
      }
       
      
      
       
       
      
      
      if(s1i==0)
          System.out.println("-1");
      
      
       for(i=0;i<as;i++)
      {
        if(arr[i]==s2)
        {
          
          System.out.println(i);
          s2i=1;
        }
      }
      
      
        if(s2i==0)
          System.out.println("-1");
      
      
       
        
          
    }
}
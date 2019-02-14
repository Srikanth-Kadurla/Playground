import java.util.Scanner;
class Main 
{ 
  public static void main(String[] args) 
  { 
    Scanner in = new Scanner(System.in); 
    // Type your ce here 
    int p=1,i,j,n=in.nextInt(); 
    for(i=1;i<=n;i++) 
    { if(i%2==0) 
        p=-(p); 
      for(j=1;j<=i;j++) 
      { 
       if(p==1) 
       { 
         if(j%2==0) 
           System.out.print("#");
         else System.out.print("*"); 
       } 
       else
       { 
         if(j%2==0) 
         System.out.print("*"); 
               else System.out.print("#");
              }
      } 
      System.out.println();
    } } }
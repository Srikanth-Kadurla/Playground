import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in =new Scanner(System.in);
      int i,t=0,n=in.nextInt();
      
      for(i=1;t<n;i++)
      {
        System.out.println(2*i-1);
        t++;
      }
	}
}
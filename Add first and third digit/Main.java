import java.util.Scanner;
class Main{
	public static void main (String[] args) 
    {
		Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int f,t;
      t=n%10;
      f=n/100;
      System.out.println(f+t);
	}
}
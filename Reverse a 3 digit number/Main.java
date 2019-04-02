import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int d=n/100;
      int e=n/10%10;
      int m=n%10;
      {
        System.out.println(m*100+e*10+d);
      }
  }
}
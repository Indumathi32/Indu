package value;
import java.util.Scanner;
public class power
{
  public static void main(String[] args)
  {
  int num;
  int pow;
  Scanner s=new Scanner(System.in);
  System.out.println("enter the num");
  num=s.nextInt();
  System.out.println("enter the pow");
  pow=s.nextInt();
  double d=Math.pow(num,pow);
  System.out.println(""+d);
  }
}

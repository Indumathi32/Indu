package value;
import java.util.Scanner;
public class armstrongNum 
{
public static void main(String[] args) 
 {
	int n, a, num=0, rem;
	Scanner scan = new Scanner(System.in);
    System.out.print("Enter any Positive Number : ");
	n = scan.nextInt();
    a = n;
	while(a != 0)
	{
	rem = a%10;
	num = num + rem*rem*rem;
	a = a/10;
	}
	if(num == n)
	{
	System.out.print("Armstrong Number");
	}
	else
	{
	System.out.print("Not an Armstrong Number");
	}
  }
}

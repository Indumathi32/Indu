package value;
import java.util.Scanner;
public class primeOrNot
{
public static void main(String[] args)
	{
		int i,num,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		num=s.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("this num is  prime");
		}
		else
		{
			System.out.println("this num is not prime");
		}
		
	}
}

	

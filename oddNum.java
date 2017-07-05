package value;
import java.util.Scanner;
public class oddNum 
{

	public static void main(String[] args)
	{
		int i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(""+i);
			}
		
		}
		// TODO Auto-generated method stub

	}

}

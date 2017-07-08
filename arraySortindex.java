package value;
import java.util.Scanner;
public class arraySortindex 
{
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int a[]=new int[n1];
	for(int i=0;i<n1;i++)
	{
	a[i]=sc.nextInt();
	}
	for(int i=0;i<n1;i++)
	{
	if(a[i]==i)
	{
	System.out.println(a[i]);
	}
	}
  }
}
	



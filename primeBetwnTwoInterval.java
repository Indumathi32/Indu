package value;
import java.util.Scanner;
public class primeBetwnTwoInterval 
{
public static void main(String[] args)
 {
   int num1, num10, i, n, rem, temp, count=0;
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter the Interval :\n");
   System.out.print("Enter Starting Number : ");
   num1 = scan.nextInt();
   System.out.print("Enter Ending Number : ");
   num10 = scan.nextInt();
   for(i=num1; i<num10; i++)
   {
   temp = i;
   n = 0;
   while(temp != 0)
   {
   rem = temp%10;
   n = n + rem*rem*rem;
   temp = temp/10;
   }
   if(i == n)
   {
   if(count == 0)
   {
   System.out.print("Armstrong Numbers Between the Given Interval are :\n");
   }
   System.out.print(i + "  ");
   count++;
   }
		        }
		        if(count == 0)
		        {
		            System.out.print("Armstrong Number not Found between the Given Interval.");
		        }
		    }
		

	}



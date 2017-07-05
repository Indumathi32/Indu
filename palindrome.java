package value;
public class palindrome 
{
public static void main(String[] args)
{
  int a,b=0,temp=0;
  int n=565;
  temp=n;
  while(n>0)
  {
  a=n%10;
  b=b*10+a;
  n=n/10;
  }
  if(temp==b)
  {
  System.out.println("palindrome number");
  }
  else
  {
  System.out.println("not palindrome");
  }
}
}

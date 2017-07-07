package value;
public class StringToIntegerConversion 
{
  public static void main(String[] args) 
   {
    Integer intObj1 = new Integer("100");
    System.out.println(intObj1);
    String str = "49";
    Integer intObj2 = Integer.valueOf(str);
    System.out.println(intObj2);
   }
}

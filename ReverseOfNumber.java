import java.util.Scanner;
class ReverseOfNumber
{
   public static void main(String args[])
   {
      int num=0;
      int revnum =0;
      System.out.println("enter the number and press enter: ");
     
      Scanner in = new Scanner(System.in);
     
      num = in.nextInt();

      while( num != 0 )
      {
          revnum = revnum * 10;
          revnum = revnum + num%10;
          num = num/10;
      }

      System.out.println("Reverse of given number is: "+revnum);
   }
}

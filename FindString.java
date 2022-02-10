import java.util.Arrays;
import java.util.Scanner;

public class FindString {

	public static void main(String[] args) {
	
		String str;
    Scanner S = new Scanner(System.in);
    System.out.print("Enter the string :");
    str = S.nextLine();
		if(str.contains("Hi"))
		{
			System.out.println("Hi is Presnt in String");
		}
		
		else
		{
			System.out.println("Hi is NOT Presnt in String");

		}
		
		
	}
	

}

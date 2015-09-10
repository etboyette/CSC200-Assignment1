import java.util.Scanner;

public class CSC200Assignment1 
{
	public static void main(String[] args)
	{
		Scanner keyboard1 = new Scanner(System.in);
		String s1;
		System.out.println("Enter a statement containing the word \"hate\"");
		s1 = keyboard1.nextLine();
		String item2 = "love";
		String result = s1.replaceFirst("hate", item2);
		System.out.println("I have changed that to:");
		System.out.println(result);
		keyboard1.close();
	}
}

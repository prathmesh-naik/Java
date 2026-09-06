import java.util.*;

class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String palindrome = sc.nextLine();

		StringBuffer sb1 = new StringBuffer(palindrome);
		String reverseString = sb1.reverse().toString();

		if (palindrome.equals(reverseString))
		{
			System.out.println("Entered string is palindrome");
		}
		else
		{
		System.out.println("Entered string is not palindrome");
		}
		sc.close();
		}
}

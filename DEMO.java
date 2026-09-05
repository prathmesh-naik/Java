public class DEMO
{
	public static void main(String[] args)
	{
		System.out.println("learning java array");
		int[] num = {10, 20, 30, 40, 50}; // numbers from 10 to 50
		for (int n1 : num)
		{
			System.out.println("numbers = " + n1);
		}
		System.out.println("------------------------------------------");

		String[] fruits = {"mango", "banana", "apple", "orange"};
		System.out.println("last element = " + fruits[fruits.length - 1]);
		System.out.println("------------------------------------------");
		for (int i = fruits.length - 1; i >= 0; i--)
		{
			System.out.println("fruits = " + fruits[i]);
		}
		System.out.println("------------------------------------------");
		for (String fruit : fruits)
		{
			System.out.println("fruits = " + fruit);
		}
	}
}
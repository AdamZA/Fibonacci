public class Fibonacci
{
	public static void main(String args[])
	{
		if(args.length > 0)
			System.out.println("The number " + args[0] + " Fibonacci number is " + fib(Integer.parseInt(args[0])) + ".");
	}

	public static int fib(int slot)
	{
		if(slot <= 0)
		{
			System.out.println("Please use a positive integer greater than or equal to 1.");
			return -1;
		}

		else if(slot == 1)
		{
			return 0;
		}

		else if(slot == 2 || slot == 3)
		{
			return 1;
		}

		else
		{
			return (fib(slot -1) + fib(slot -2));
		}

	}
}
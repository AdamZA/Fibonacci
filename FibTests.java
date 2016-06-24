public class FibTests
{
	static int failures = 0;
	static int successes = 0;

	public static void main(String args[])
	{
		fibTest(-1, -1);
		fibTest(1, 0);
		fibTest(7, 8);

		System.out.println("Tests: " + (failures+successes) + "\nSuccesses: " + successes + "\nFailures: " + failures);
	}

	public static void fibTest(int slot, int expected)
	{
		Fibonacci fib = new Fibonacci();
		int result;
		try{
			result = fib.fib(slot);
			System.out.println("Testing for slot = " + slot + "\nExpected: " + expected + "\nResult: " + result);
			}
		catch(Exception e)
		{
			result = -1;
			System.out.println("Testing for slot = " + slot + "\nExpected: " + expected + "\nResult: " + result);
		}
		
		if(result == -1 && result != expected)
		{
			System.out.println("Failure.");
			failures++;
		}
		else if(result == expected)
		{
			System.out.println("Success.");
			successes++;
		}

		System.out.println("");
	}
}


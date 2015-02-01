/**
 * The sequence of triangle numbers is generated by adding the natural numbers. 
 * So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

	1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

	Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28

	We can see that 28 is the first triangle number to have over five divisors.

	What is the value of the first triangle number to have over five hundred divisors?

 * @author Hardik Joshi
 *
 */


public class Highly_divisible_triangular_number
{

	public static void main(String[] args)
	{
		int divisorLimit = 500;
		boolean foundLimit = false;
		
		int divisors = 0;
		long triangleNum = 1;
		long total = 0;
		while(!foundLimit)
		{
			total += triangleNum;
			
			divisors = numOfDivisors2(total);
			
			
			if(divisors > divisorLimit)
			{
				foundLimit = true;
				System.out.println("First Triangle Number " + 
				triangleNum + " with value " + total + " has " + divisors + " divisors.");
			}
			
			triangleNum++;
		}

	}
	
	public static int numOfDivisors(long x)	// bad way
	{
		int divisors = 0;
		
		for(int i=1; i <= x; i++)
		{
			if(x % i == 0)
			{
				divisors++;
			}
		}
		
		
		return divisors;
	}
	
	public static int numOfDivisors2(long x)	// better way
	{
		int divisors = 0;
		
		int sqrt = (int) Math.sqrt(x);
		
		for(int i=1; i <= sqrt; i++)
		{
			if(x % i == 0)
			{
				divisors += 2;
			}
		}
		
		if((sqrt * sqrt) == x)	// make correction for square root values
		{
			divisors--;
		}
		
		return divisors;
	}

}
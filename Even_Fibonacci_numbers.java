/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 * 
 *	1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 *	By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 *	find the sum of the even-valued terms.
 *
 * @author Hardik Joshi 
 *
 */

public class Even_Fibonacci_numbers
{

	public static void main(String[] args)
	{
		long sum = 0;
		
		int num = 1;
		int numPrev = 1;
		while(num < 4000000)
		{
			//System.out.println(num);
			
			if(num % 2 == 0)
			{
				sum += num;
			}
			
			int temp = num;
			num += numPrev;
			numPrev = temp;
		}
		
		System.out.println("The sum of the even-valued terms upto 4 million is " + sum);

	}

}
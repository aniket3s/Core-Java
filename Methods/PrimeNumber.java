class PrimeNumber 
{
	public static void main(String[] args) 
	{
		isPrime(2);
		isPrime(1);
		isPrime(8);
		isPrime(11);
	}

	public static void isPrime(int num)
	{
		int den = 2;

		while(den<=num)
		{
			if (num%den == 0)
			{
				break;
			}
			den++;
		}
		if (num==den) System.out.println(num +" is Prime Number.");
		else System.out.println(num +" is not a prime Number.");
	}
}

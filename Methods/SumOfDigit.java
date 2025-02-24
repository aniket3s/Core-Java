class SumOfDigit 
{
	public static void main(String[] args) 
	{
		SumOfDigit(139);
		SumOfDigit(304);
	}

	public static void SumOfDigit(int num)
	{
		int sum = 0;
		while (num>0)
		{
			int rem = num%10;
			sum += rem;
			num/=10;
		}
		System.out.println("Sum of digit is "+sum);
	}
}

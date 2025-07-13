import java.util.Scanner;

// range of prime
class RangeOfPrime{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		for (int i = start;i<=end ;i++ )
		{
			if (isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static boolean isPrime(int num){
		int den = 2;
		while (den<num)
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
		return num==den;
	}
}
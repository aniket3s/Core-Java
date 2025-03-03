import java.util.Scanner;
class RotatingPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();				
		int rotatedNumber = rotatingNumber(num);

		for (int i=0; i<cnt(num); i++)
		{
			if (isPrime(rotatedNumber))
			{
				System.out.println(rotatedNumber);
			}
			rotatedNumber = rotatingNumber(rotatedNumber);
		}
	}

	public static int rotatingNumber(int num)
	{
		int rem = num%10;
		int dup = num;
		while (num > 0)
		{
			num/=10;
			rem*=10;
		}
		int rotatedNumber = (rem/10)+(dup/10);
		return rotatedNumber;
	}
	public static boolean isPrime(int num)
	{
		int den = 2;
		while (den<num)
		{
			if (num%den == 0)
			{
				break;
			}
			den++;
		}
		return den==num;
	}
	public static int cnt (int num)
	{
		int cnt = 0;
		int dup = num;
		while (dup>0)
		{
			cnt++;
			dup/=10;
		}
		return cnt;
	}
}

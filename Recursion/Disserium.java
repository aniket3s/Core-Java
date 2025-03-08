import java.util.Scanner;
class Disserium 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(sumPower(n));
	}
	public static int sumPower(int n)
	{
		int sumOfDgt = sumOfDigit(n);
		int pow = 1;
		for (int i=0;i<cnt(n);i-- )
		{
			sumOfdgt = sumOfDgt*i;
			n/=10;
		}
		return pow;
	}
	public static int sumOfDigit(int n)
	{
		int sum = 0;
		int dup = n;
		while (dup!=0)
		{
			sum+= dup%10;
			dup/=10;
		}
		return sum;
	}
	public static int cnt(int n)
	{
		int ct = 0;
		int dup = n;
		while (dup!=0)
		{
			ct++;
			dup/=10;
		}
			return ct;
	}
}

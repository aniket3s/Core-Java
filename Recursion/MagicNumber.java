import java.util.Scanner;
class MagicNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isMagic(num));
	}
	public static boolean isMagic(int n)
	{
		int sum = sumOfDigit(n);
		while (sum>9)
		{
			sum = sumOfDigit(sum);
		}
		return sum==1;
	}
	public static int sumOfDigit(int n)
	{
		int sum = 0;
		while (n!=0)
		{
			sum+= n%10;
			n/=10;
		}
		return sum;
	}
}
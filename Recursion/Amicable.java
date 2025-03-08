import java.util.Scanner;
class Amicable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.print(isAmmicable(n1,n2));
	}
	public static boolean isAmmicable(int n1, int n2)
	{
		return factorSum(n1)==factorSum(n2) ;
	}
	public static int factorSum(int n)
	{
		int sum = 0;
		for (int i =1;i <=n ;i++ )
		{
			if (n%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
}

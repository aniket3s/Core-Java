import java.util.Scanner;
class isStrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isStrong(num));
	}
	public static boolean isStrong(int n )
	{
		int sum = 0;
		for (int i =n;i>0;i/=10)
		{
			int last = i % 10;
			sum += fact(last);
		}
		return n  == sum;
	}
	public static int fact(int digit)
	{
		int fact = 1;
		for (int i=digit; i>0;i-- )
		{
			fact *= i;
		}
		return fact;
	}
}

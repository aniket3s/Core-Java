import java.util.Scanner;
class MystryNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isMystry(n));
	}
	public static boolean isMystry(int n)
	{
		for (int i=1;i<=n ;i++ )
		{
			if (i+reverse(i)==n)
			{
				System.out.println(i+" "+reverse(i));
				return true;
			}
		}
		return false;
	}
	public static int reverse(int n)
	{
		int rev = 0;
		while (n!=0)
		{
			rev = rev*10+(n%10);
			n/=10;
		}
		return rev;
	}
}

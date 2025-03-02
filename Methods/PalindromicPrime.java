import java.util.Scanner;
class PalindromicPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (isPrime(num) && isPalindrome(num))
			System.out.println(num + " is a palindromicPrime Number. ");
		else
			System.out.println(num+" is not a palindromicPrime Number. ");		
	}
	public static boolean isPalindrome(int n)
	{
		int dup = n;
		int rev = 0;
		while(dup!=0){
	    rev = rev*10 + (dup%10);
		dup/=10;
		}
		return n == rev ;
	}
	public static boolean isPrime(int n )
	{
		int den = 2;
		while (den<n)
		{
			if (n%den == 0)
			{
				break;
			}
			den++;
		}
		return n == den;
	}
}

import java.util.Scanner;
class RecIsPalindrome 
{
	public static boolean isPalindrome(int num, int temp, int rev)
	{
		if (temp==0)
		{
			return num==rev;
		}
		rev = rev*10 +(temp%10);
		return isPalindrome(num, temp/10, rev);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isPalindrome(num,num,0));
	}
}

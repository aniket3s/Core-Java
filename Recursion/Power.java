import java.util.Scanner;
class Power 
{
	public static int power(int base, int raise)
	{
		if (raise==0)
		{
			return 1;
		}
		return base*power(base, raise-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(power(a,b));
	}
}

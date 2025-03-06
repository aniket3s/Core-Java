import java.util.Scanner;
class Hcf 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(hcf(num1,num2));
		System.out.println(isCoprime(num1,num2));
	}
	public static int hcf(int n1, int n2)
	{
		int min = n1<n2?n1:n2;
		
		while (true)
		{
			if (n1%min==0&&n2%min==0)
			{
				return min;
			}
			min--;
		}
	}
	public static boolean isCoprime(int n1, int n2)
	{
		return hcf(n1,n2)==1;
	}
}

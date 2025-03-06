import java.util.Scanner;
class Lcm 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(lcm(n1,n2));
	}
	public static int lcm(int num1, int num2)
	{
		int max = num1>num2?num1:num2;
		
		int i = 1;
		while (true)
		{
			if ((max*i)%num1==0 && (max*i)%num2==0)
			{
				return (max*i);
			}
			i++;
		}
	}
}

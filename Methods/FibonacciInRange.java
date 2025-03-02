import java.util.Scanner;
class FibonacciInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		fibonacci(start,end);
	}

	public static void fibonacci(int start, int end)
	{
		int a = 0;
		int b = 1;
		int c = a + b;
		
		while (a<=end)
		{
			if (a>= start)
			{
				System.out.print(a+" ");
			}
			a = b;
			b = c;
			c = a + b;
		}
	}
}

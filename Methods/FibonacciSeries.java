import java.util.Scanner;
class FibonacciSeries
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		fibonacci(sc.nextInt());
	}

	public static void fibonacci(int end)
	{
		int num1 = 0 ; int num2 = 1; 
		
		for (int i =0;i<end ; i= num1 // i++)
		{
			System.out.print(num1+" ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
	}
}

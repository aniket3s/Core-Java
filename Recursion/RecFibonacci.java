class RecFibonacci 
{
	public static void fibonacci(int num1, int num2,int n)
	{
		if (n>0)
		{
			int num3 = num1 + num2;
			System.out.print(num1+" ");
			n--;
			fibonacci(num2,num3,n);
		}
		return;
	}
	public static void main(String[] args) 
	{
		fibonacci(0,1,5);
	}
}

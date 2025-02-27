import java.util.Scanner;
class M1
{
	public static void main(String[] args) 
	{
		System.out.println("main method start ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		add(num1, num2);
		subtraction(num1, num2);
		System.out.println("main method end ");
	}
	public static void add(int num1 , int num2)
	{
		System.out.println("add metod starts ");
		int sum = num1+ num2;
		System.out.println(sum);
		System.out.println("add Method ends ");
	}
	public static void subtraction(int num1,int num2)
	{
		System.out.println("subtraction method start ");
		int sub = num1 - num2;
		System.out.println(sub);
		System.out.println("Subtraction method end ");
	}
}

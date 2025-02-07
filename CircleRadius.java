import java.util.Scanner;
class  CircleRadius
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		final float pi = 22/7f;
		System.out.println("Enter the Radius : ");
		float radius = sc.nextInt();
		double Area = pi * radius * radius;
		System.out.println("Area of Circle is "+Area +"Cm2");
	}
}

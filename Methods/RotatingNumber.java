import java.util.Scanner;
class RotatingNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		int rotatedNumber = rotatingNumber(num); 

		System.out.println(rotatedNumber);
	}

	public static int rotatingNumber(int num)
	{
		int rem = num%10;
		int dup = num;
		while (num > 0)
		{
			num/=10;
			rem*=10;
		}
		int rotatedNumber = (rem/10)+(dup/10);
		return rotatedNumber;
	}
}

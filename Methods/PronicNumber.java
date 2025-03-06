import java.util.Scanner;
class PronicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isPronic(num));
	}
	public static boolean isPronic(int n)
	{
		for (int i=1; ;)
		{
			if (i*(i+1)==n)
			{
				return true;
			}
			else if (i*(i+1)>n)
			{
				return false;
			}
			else
			{
				i++;
			}
		}
	}
}

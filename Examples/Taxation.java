import java.util.Scanner;
class Taxation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary : ");
		int salary = sc.nextInt();

		if(salary <= 1200000)
		{
			System.out.println(" NO tax Aur jyada kamao : ");
		}
		else if (salary>1200000 && salary <= 1600000)
		{
			System.out.println(salary*0.15+" tax lagega");
		}
		else if (salary >1600000 && salary<=2000000)
		{
			System.out.println(salary*0.20 +" rs tax");
		}
		else if(salary > 2000000)
		{
			System.out.println(salary*.30 +" rs tax");
		}
		else
		{
			System.out.println("Eneter valid salary ");
		}

	}
}

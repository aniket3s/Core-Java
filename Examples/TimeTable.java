import java.util.Scanner;
class TimeTable 
{
	public static void main(String[] args) 
	{
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day : ");
		int day = sc.nextInt();
		
		switch(day)
		{
			case 1:
			{
				System.out.println("Marathi aapli matrubhasha marathi vachan");
				break;
			}
			case 2:
			{
				System.out.println("Hindi or Sanscrit read favourate one ");
				break;
			}
			case 3:
			{
				System.out.println("Explore the geography ");
				break;
			}
			case 4:
			{
				System.out.println("Let's talk in english ");
				break;
			}
			case 5:
			{
				System.out.println("let the paper fly with color ");
				break;
			}
			case 6:
			{
				System.out.println("experience the science ");
				break;
			}
			case 7:
			{
				System.out.println("Chill the day ");
				break;
			}
			default:
			{
				System.out.println("go to the school ");
				break;
			}
		}

	}
}

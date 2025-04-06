import java.util.Scanner;

class SwitchSeason 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month  = sc.nextInt();

		switch(month)
		{
			case 2:
			case 3:
			case 4:
			case 5:
			{
				System.out.println(month + " It's Summer : ");
				break;
			}
			    case 6:
			    case 7:
			    case 8:
			    case 9:
		    {
			    System.out.println(month +" It's Rainy ");
			    break;
		    }
		       case 10:
		    {
			    System.out.println(month + "It's Autum");
			    break;
		    }
		    case 11:
		    case 12:
		    case 1:
		    {
			    System.out.println(month + " It's Winter");
			    break;
		    }
		    default:
		    {	     
				aSystem.out.println("Enter the valid month :");
			    break;
			}
		}

	}
}

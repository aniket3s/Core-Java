import java.util.Scanner;
class SwitchVowel
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		char character = sc.next().charAt(0);

		switch(character)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			{
				System.out.println(character + " It's Vowel ");
				break;
			}
			default :
			{
				System.out.println(character + " It's not Vowel ");
				break;
			}
			
		}
	}
}

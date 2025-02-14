class Decrement 
{
	public static void main(String[] args) 
	{
		int a = 305;
		System.out.println(--a); //304
		System.out.println(--a); //303
		System.out.println(a--); //303
		System.out.println(--a); //301
		System.out.println(--a - a--); //0
		
	}
}

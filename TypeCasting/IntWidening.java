class IntWidening 
{
	public static void main(String[] args) 
	{
		int i = 2147483647;
//		char ch = i;
		long l = i;
		float f = i;
		double d = i;
		
		System.out.println("int : "+i);
//		System.out.println("char : "+ch);   possible lossy conversion from int to char			
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		System.out.println("double :"+d);
	}
}
/*int : 2147483647
long :2147483647
float :2.14748365E9
double :2.147483647E9
*/
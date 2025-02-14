class LongWidening
{
	public static void main(String[] args) 
	{
		long l = 8483019; //integer number too large: 8483019304
		float f = l;
		double d = l;

		System.out.println("long :"+l);
		System.out.println("float : " +f);
		System.out.println("double : " +d);

/*long :8483019
float8483019.0
double8483019.0*/
	}
}

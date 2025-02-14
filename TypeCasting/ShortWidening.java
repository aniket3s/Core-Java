class ShortWidening 
{
	public static void main(String[] args) 
	{
		short s = 32767;
		int i = s;
//		char ch = s;
		long l = s;
		float f = s;
		double d = s;

		System.out.println("int :"+i);
//		System.out.println("char: "+ch);  possible lossy conversion from short to char
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		System.out.println("double :"+d);
	}
}
/*
int :32767
long :32767
float :32767.0
double :32767.0
*/

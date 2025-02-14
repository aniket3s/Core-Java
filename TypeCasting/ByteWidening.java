class ByteWidening 
{
	public static void main(String[] args) 
	{
		byte b = 127;
		short s = b;
	//	char ch = b; 
		int i = b;
		long l = b;
		float f = b;
		double d = b;

		System.out.println("byte : "+ b);
		System.out.println("short: "+s);
	//	System.out.println("Char :"+ch)  incompatible types: possible lossy conversion from byte to char
		System.out.println("Int : "+i);
		System.out.println("long : "+l);
		System.out.println("float : "+f);
		System.out.println("double : "+d);
	}
}

/*
byte : 127
short: 127
Int : 127
long : 127
double : 127.0
*/
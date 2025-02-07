// byte < short < int < long < float < double
//        char

class ShortNarrowing 
{
	public static void main(String[] args) 
	{
		short s = 32767;
		char ch = (char)s;
		byte b = (byte)s;

		System.out.println("short : "+s);  // short : 32767
		System.out.println("Char : "+ch);  // Char : ?
		System.out.println("byte : "+b);  // byte : -1
	}
}




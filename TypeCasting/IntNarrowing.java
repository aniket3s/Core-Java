// byte < short < int < long < float < double
//        char

class IntNarrowing 
{
	public static void main(String[] args) 
	{
		int i = 2147483647;
		short s = (short)i;
		char ch = (char)i;
		byte b = (byte)i;

		System.out.println("int : "+i);  //int : 2147483647
		System.out.println("short : "+s); //short : -1
		System.out.println("char : "+ch); //char : ?
		System.out.println("byte : "+b); //byte : -1

	}
}




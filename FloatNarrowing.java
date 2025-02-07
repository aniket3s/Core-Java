// byte < short < int < long < float < double
//        char

class FloatNarrowing
{
	public static void main(String[] args) 
	{
		float f = 33.4f;
		long l = (long)f;
		int i = (int)l;
		char ch = (char)l;
		short s = (short)l;
		byte b = (byte)l;

		System.out.println("float : " + f); //float : 33.4
		System.out.println("int : " +i);	//int : 33
		System.out.println("short : " +s);  // short : 33
		System.out.println("char : " +ch);  // char : !
		System.out.println("byte : " +b);   //byte : 33

	}
}

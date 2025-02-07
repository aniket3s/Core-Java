// byte < short < int < long < float < double
//        char

class LongNarrowing 
{
	public static void main(String[] args) 
	{
		long l = 12333l;
		int i = (int)l;
		short s = (short)l;
		char ch = (char)l;
		byte b = (byte)l;


		System.out.println("long : "+l);   //long : 12333
		System.out.println("Int : "+i);    //Int : 12333
		System.out.println("short : "+s);  //short : 12333
		System.out.println("Char : "+ch);  //Char : ?
		System.out.println("Byte : "+b);   //Byte : 45

	}
}





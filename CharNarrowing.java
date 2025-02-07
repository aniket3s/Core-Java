// byte < short < int < long < float < double
//        char
class CharNarrowing
	{
		public static void main(String[] args) 
		{
			char ch = 'a';
			byte b = (byte)ch;

			System.out.println("Char : "+ch); // Char : a
			System.out.println("byte : "+b);  // byte : 97
		}
	}

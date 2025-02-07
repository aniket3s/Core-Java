class CharCasting 
{
	public static void main(String[] args) 
	{
		char ch = 'a';
		long l = ch;
		float f =ch;
		double d = ch;
		
		System.out.println("ch : "+ch);
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		System.out.println("double :"+d);

/*
->java CharCasting
ch : a
long :97
float :97.0
double :97.0*/
	}
}

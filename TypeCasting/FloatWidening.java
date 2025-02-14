class FloatWidening

{
	public static void main(String[] args) 
	{
		float f = 22.34f;
		double d = f;

		System.out.println("float : "+f);
		System.out.println("double : "+d);

		/*float : 22.34
		double : 22.34000015258789*/
	}
}

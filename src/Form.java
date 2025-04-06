class Form
{
	String name; // mandatory
	long phno;   // mandatory
	long tel;    // non mandatory
	char gen;    // mandatory
	String blood;// non madatory
	String email;// non mandatory
	String dob; // mandatory

	Form(){}

	Form(String name,long phno, long tel,char gen, String blood,String email,String dob)
	{
		this.name = name; // storing the local variable value to the object variable
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
	}

	Form(String name,long phno, long tel,char gen)
	{
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;

		this.tel = tel; // null
	}
	
	void displayForms()
	{
		System.out.println("Name : "+name);
		System.out.println("Phno : "+phno);
		System.out.println("tel : "+tel);
		System.out.println("gen : "+gen);
		System.out.println("blood : "+blood);
		System.out.println("email : "+email);
		System.out.println("DOB : "+dob);
	}
}

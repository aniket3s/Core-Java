// it is an ternary operator

class Relational1
{
	public static void main(String[] args) 
	{
	  /* Syntax : condition ? val/exp : val/exp 
	               operand1  operand2  operand3                             */

		int num = -34;
		int num2 =6;

		String ans = num < 0 ? "Negative" : "positive" ;
		System.out.println("ans : "+ans);

		String ans2 = num%2 == 0 ? "Even" : "Odd";
		System.out.println("ans : " +ans2); 
	}
}

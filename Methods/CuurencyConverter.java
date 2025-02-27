import java.util.*;
import java.util.Scanner;
class CuurencyConverter 
{
	public static void main(String[] args) 
	{
		System.out.println("main method starts : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount in rupees : ");
		double rupee = sc.nextDouble();
		rupeeToDollar(rupee);
		System.out.println("main method ends !");
	}
	public static void rupeeToDollar(double rupee)
	{
		double dollar = rupee/87.15;
		System.out.println(rupee + " rupee is equals to: "+dollar+" dollars");
		System.out.println("rupeeToDollarEnds !");
		dollarToEuro(dollar);
	}
	public static void dollarToEuro(double dollar){
		double euro = (dollar * 0.95);
		System.out.println(dollar+" dolllar equals to "+euro +" euros.");
		System.out.println(" dollar to euro ends !");
	}
}

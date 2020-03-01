import java.util.Scanner;

public class rationalNumberMain {
	
	public static void main (String[]args){
		
		rationalNumber rat = new rationalNumber();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first rational");
		String rational= input.next();
		rational=rational.replaceAll("\\s","");
		
		System.out.println("Enter second rational");
		String rational1= input.next();
		rational1=rational1.replaceAll("\\s", "");
		
		
		rationalNumber rat1 = new rationalNumber (rational);
		rationalNumber rat2 = new rationalNumber (rational1);
		
		System.out.println("Compare or add rationals?");
		String choice=input.next();
		
		if (rat1.getDen()==0 || rat2.getDen()==0)
		{
			throw new NumberFormatException();
		}
		else if (choice.equals("compare"))
		{
			double decimal1=rat1.getNum()/rat1.getDen();
			double decimal2=rat2.getNum()/rat2.getDen();
			
			if (decimal1>=decimal2) {
				System.out.println("The first rational is larger");
			}
			else if (decimal1<=decimal2)
			{
				System.out.println("The second rational is larger");
			}
		}
		else if (choice.equals("add")) 
		{
			
		}
		else 
		{
			System.out.println("not a choice");
		}
		
	}
	
}

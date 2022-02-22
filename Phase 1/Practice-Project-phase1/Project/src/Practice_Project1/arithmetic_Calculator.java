package Practice_Project1;
import java.util.Scanner;

public class arithmetic_Calculator {

		public static void main(String[] args) {
			
			int result;
			
			System.out.println("<-----Welcome to Arithmetic Calculator------>");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\n           Enter two numbers\n\n");
			System.out.println("Enter first number");
			int firstNumber = sc.nextInt();
			System.out.println("Enter second number");
			int secondNumber = sc.nextInt();
			System.out.println("What do you want perform( Add (+) , Sub(-) , Mul(*) , Div(/) ) .");
			char choice = sc.next().charAt(0);
			switch(choice)
			{
			case '+':
			{
		        result=firstNumber+secondNumber;
				System.out.println("Addition of "+firstNumber+" and "+secondNumber+" is "+result);
				break;
			}
			case '-':
			{
				result=firstNumber-secondNumber;
				System.out.println("Substraction of "+firstNumber+" and "+secondNumber+" is "+result);
				break;
			}
			case '*':
			{
				result = firstNumber*secondNumber;
				System.out.println("Multiplication of "+firstNumber+" and "+secondNumber+" is "+result);
				break;
			}
			case '/':
			{try {
				result=firstNumber/secondNumber;
				System.out.println("Divition of "+firstNumber+" and "+secondNumber+" is "+result);
				break;
			}catch(ArithmeticException ae){
				System.out.println("sorry devision by 0 is not possible "+ae.getMessage());
			}
			}
		
			default:
			{
				System.out.println("Invalid input");
			}
					
					
			}

		}
}

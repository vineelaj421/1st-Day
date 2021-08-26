package Assignment1;
import java.util.Scanner;
public class Operators5 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		float num1,num2,num3,num4,num5;
		Scanner SC = new Scanner(System.in);
		num1 = SC.nextFloat();
		num2 = SC.nextFloat();
		num3 = SC.nextFloat();
		num4 = SC.nextFloat();
		num5 = SC.nextFloat();
		System.out.println("avg of five numbers is %.2f" +(num1+num2+num3+num4+num5)/5);

	}

}


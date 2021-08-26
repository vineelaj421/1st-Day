package Assignment1;
import java.util.Scanner;
public class Operators3 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int t;
		Scanner SC = new Scanner(System.in);
		num1 = SC.nextInt();
		num2 = SC.nextInt();
		System.out.println("before swapping"+num1+num2);
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("after swapping"+num1+num2);
		

	}

}


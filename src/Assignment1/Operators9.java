package Assignment1;
import java.util.Scanner;
public class Operators9 {

	public static void main(String[] args) {
		int num1;
		Scanner SC = new Scanner(System.in);
		num1 = SC.nextInt();
		String msg=(num1%2==0)?"the number is even":"the number is odd";
		System.out.println(msg);

	}

}


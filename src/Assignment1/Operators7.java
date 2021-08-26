package Assignment1;
import java.util.Scanner;
public class Operators7 {

	public static void main(String[] args) {
		float P,r,t,si;
		Scanner SC = new Scanner(System.in);
		P=SC.nextFloat();
		r=SC.nextFloat();
		t=SC.nextFloat();
		si=P*r*t/100;
		System.out.println("simple interest"+si);

	}

}


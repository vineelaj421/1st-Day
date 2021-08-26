package Assignment1;
import java.lang.Math;
import java.util.Scanner;
public class Operators6 {

	public static void main(String[] args) {
		int x;
		int y;
		Scanner SC = new Scanner(System.in);
		x=SC.nextInt();
		y=SC.nextInt();
		System.out.println("area of square"+Math.pow(x, 2));
		System.out.println("area of rectangle"+x*+y);
		double z=3.14*x*x;
		System.out.println("area of circle"+z);

	}

}


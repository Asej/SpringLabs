package springlab.SpringLabs;

import java.util.Scanner;

public class Rectangle_test {

	public static void main(String[] args) {
		System.out.println("How many rectangles?");
		Scanner input = new Scanner(System.in);
		int t=input.nextInt();
		for(int i = 0; i<=t;i++) {
			double leng=input.nextDouble();
			double wid= input.nextDouble();
			Rectangle rec = new Rectangle(leng,wid);
			System.out.println(rec.getArea());
			System.out.println(rec.getPerimeter());

		}
		input.close();
	}

}

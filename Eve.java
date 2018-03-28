package springlab.SpringLabs;

import java.util.Scanner;

public class Eve {

	public static void tpe(String s) {
		if(s.length()%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
	}
	public static void main (String[]args) {
		Scanner inout = new Scanner(System.in);
		String message = inout.nextLine();
		tpe(message);
	}
}

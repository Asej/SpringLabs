package springlab.SpringLabs;

import java.util.Scanner;

public class OddString {

	public static boolean  Oddtring(String a) {
		boolean fact;
		if(a.length()%2==0) {
			fact = true;
		}else {
			fact=false;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Type a String");
		Scanner scan = new Scanner(System.in);
		String phrase = scan.nextLine();
		scan.close();
		System.out.println(Oddtring(phrase));
	}

}

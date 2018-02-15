package springlab.SpringLabs;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner integers = new Scanner(System.in);
	    int a = integers.nextInt();
		int b = integers.nextInt();
		integers.close();
		int c = multiNumbers(a,b);
		int r = multiNumbers(6, 2121);
		System.out.println(c+"\n"+r+"\n"+multiNumbers(2, 222));
		
	}
	protected static int multiNumbers(int one, int two) {
		int multiple = one*two;
		return multiple;
	}

}

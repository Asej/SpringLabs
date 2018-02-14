package springlab.SpringLabs;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner integers = new Scanner(System.in);
	    int a = integers.nextInt();
		int b = integers.nextInt();
		int c = addNumbers(a,b);
		int r = addNumbers(6, 2121);
		System.out.println(c+"\n"+r+"\n"+addNumbers(2, 222));
		
	}
	protected static int addNumbers(int one, int two) {
		int sum = one + two;
		return sum;
	}

}

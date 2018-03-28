package springlab.SpringLabs;

import java.util.Arrays;
import java.util.Scanner;

public class NUMN {

	public static void N(int n) {
		System.out.println(n*11+n*111+n);
	}

	public static void main(String[] args) {
		System.out.println("Type a number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		N(num);
		char[] stuff= {'a','d','f','e','e'};
		Arrays.sort(stuff);
		System.out.println(stuff);
	}

}

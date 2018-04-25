package springlab.SpringLabs;

import java.util.Scanner;

public class arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long [] table = new long[10];
		Scanner input = new Scanner(System.in);
		long sum = 0;
		for (int i = 0; i < table.length; i++) {
			System.out.println("input a number");
			table[i]=input.nextLong();
			sum=table[i]+sum;

		}
		System.out.println(sum);
	}

}

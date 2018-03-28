package springlab.SpringLabs;

import java.util.Scanner;

public class MultiplicationTBl {

	public static void TBl(int num) {
		for (int i = 0; i<=10;i++) {
					System.out.print(num*i+" ");
					while(i%3==0) {
						System.out.print("\n");
						break;
					}
		}
	}

	public static void main(String[] args) {
		System.out.println("Type a number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		TBl(num);
	}

}

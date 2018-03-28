package springlab.SpringLabs;

import java.util.Scanner;

public class LGnSM {

	public static void main(String[] args) {
		System.out.println(" Type three numbers");
		Scanner input = new Scanner(System.in);
		int large = 0;
		int small = 2147483647;
		for( int i=0; i<3;i++) {
			int one = input.nextInt();
			if(large<=one) {
				large=one;
			}				
			if(small>=one) {
			small=one;
		}
	}
			System.out.println(large);
			System.out.println(small);

	}
}

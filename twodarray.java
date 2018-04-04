package springlab.SpringLabs;

import java.util.Scanner;

public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] gr1 = new int [10];
		int [] gr2 = new int [10];
		int [] gr3 = new int [10];

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < gr2.length; i++) {
			gr1[i] = input.nextInt();
			gr2[i] = input.nextInt();
			gr3[i] = gr1[i]+gr2[i];		
			System.out.println(gr3[i]);
		}

	}
}

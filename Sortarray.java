package springlab.SpringLabs;

import java.util.Arrays;
import java.util.Scanner;

public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar [] = new int [3];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < ar.length; i++) {
			ar[i] = input.nextInt();
		}
		Arrays.sort(ar);
		System.out.println("Largest: "+ar[ar.length-1]+" Smallest: "+ar[0]);
	}

}

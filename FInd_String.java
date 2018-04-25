package springlab.SpringLabs;

import java.util.Scanner;

public class FInd_String {

	public static void main(String[] args) {

		System.out.println("Type 5 subjects");
		Scanner input = new Scanner(System.in);
		String [] Class = new String[5];
		for (int i = 0; i < Class.length; i++) {
			Class[i] = input.nextLine().toLowerCase();
		}
		System.out.println("type a subject to search");
		String sub = input.nextLine().toLowerCase();
		for (int i = 0; i < Class.length; i++) {
			if(sub.equals(Class[i])) {
				System.out.println("That Class Exists");
			}
		}
	}

}

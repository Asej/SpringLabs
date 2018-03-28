package springlab.SpringLabs;

import java.util.Scanner;

public class FirstVowel {

	public static void first(String str) {
		char V='i';
		str.toLowerCase();
		for (int i = 0; i<str.length()-1;i++) {

			char t = str.charAt(i); 
			if (t=='a'||t=='e'||t=='i'||t=='o'||t=='u') {
				V=str.charAt(i);
				System.out.println(V);
				i=str.length()-1;
			}
		}

	}
	public static void main(String[] args) {
		System.out.println("Type something");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		first(str);
		input.close();

	}
}

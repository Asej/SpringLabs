package springlab.SpringLabs;

import java.util.Scanner;

public class Chars {

	public Chars() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String ftext= "James";
		char c1= ftext.charAt(0);
	System.out.println("type  something");
		//System.out.println(ftext.length());
		Scanner input = new Scanner(System.in);
		String stuff = input.nextLine();
		System.out.println(stuff.charAt(stuff.length()-1));
	}

}

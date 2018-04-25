package springlab.SpringLabs;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		System.out.println("Input 5 names");
		
		String [] name = new String[5];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < name.length; i++) {
			
			name[i]=input.nextLine();
			
		}for (int i = 0; i < name.length; i++) {
			
			System.out.println(name[i]);
		}
		input.close();
	}

}

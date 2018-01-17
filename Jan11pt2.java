package springlab;

import java.util.Scanner;

public class Jan11pt2 {

	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.println("How many ages are you checking?");
		
		for(int number = val.nextInt();number>0;number--) {
			int age = val.nextInt();		
			
			if (age < 18) {
				System.out.println("You Cannot Vote!!!!");
			}else if(age == 18) {
				System.out.println(" You can vote!!!");
			}else {
				System.out.println(" You can vote & are eligble to obtain a drivers liscense!!!");
		}
	}val.close();
	}
}

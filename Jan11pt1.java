package springlab;

import java.util.Scanner;

public class Jan11pt1 {

	public static void main(String[] args) {
		System.out.println(" How many numbers you want to check?");
		Scanner input = new Scanner(System.in);
		int num= input.nextInt();int two=0;
		
		for(int one;num>0; num-- ) {
			one= input.nextInt();
			if(one>two) {
				two=one;}
		}
			System.out.println(two+" is the present largest number.");
		input.close();
		/*int first = input.nextInt();
		int snd = input.nextInt();
		int third = input.nextInt();
		int forth = input.nextInt();
		input.close();
		if((first>snd) && (first >third)&&(first<forth) ) {
			System.out.println(first + " is the greatest number");
		}else if((first < snd) && (snd > third)&&(snd>forth) ) {
			System.out.println(snd + " is the greatest number");
		
	}else if ((first < third) && (snd > third)&&(third>forth) ) {
		System.out.println(third + " is the greatest number");

	}else {		System.out.println(forth + " is the greatest number");

		
	}*/
			
}}

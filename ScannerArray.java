package springlab.SpringLabs;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		int [] num= new int[3];
		
		Scanner input = new Scanner(System.in); 
		for(int i=0; num.length>i;i++) {
		System.out.println("Type a number");	
		num[i]=input.nextInt();
		//System.out.println(num[i]);
		input.close();
		}
		for(int i=0; num.length>i;i++) {
			System.out.print(num[i]);}
	}

}

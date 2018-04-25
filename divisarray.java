package springlab.SpringLabs;

import java.util.Scanner;

public class divisarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] table = new int[5];
Scanner input = new Scanner(System.in);
for (int i = 0; i < table.length; i++) {
	System.out.println("input a number");
	table[i]=input.nextInt();
	
}
for (int i = 0; i < table.length; i++) {
	if((table[i]>10)&&(table[i]%4==0)&&(table[i]%5==0)){
		System.out.print("fits parameters"+table[i]);
		
	}
	input.close();
}
	}

}

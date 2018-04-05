package springlab.SpringLabs;

import java.util.Scanner;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] i = new int [4];
int even = 0; 
int odd = 0;
Scanner input = new Scanner(System.in);
for (int j = 0; j < i.length; j++) {
	i[j]=input.nextInt();
	if (i[j]%2==0) {
		even= even+1;
	} else {
		odd=odd+1;
	}
}	System.out.println("Odd numbers: "+odd+" Even numbers: "+even);

	}

}

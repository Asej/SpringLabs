package springlab.SpringLabs;

import java.util.Scanner;

public class Div32 {

	public static boolean Div3(int a) {
		boolean value;
		if(a%3==0&&a%2==0) {
			value = true;
		}else {
			value = false;
		}
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type int");
		Scanner scan = new Scanner(System.in);
		int phrase = scan.nextInt();
		scan.close();
		System.out.println(Div3(phrase));
	}

}

package springlab.SpringLabs;

import java.util.Scanner;

public class s {
	static double pie=3.14;
public static double getArea(int rad) {
	return pie*rad*rad;
}
public static double getCircum(int rad) {
	return pie*rad*2;
}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int i=input.nextInt();
		System.out.println(getArea(i)+" "+getCircum(i));
}
}
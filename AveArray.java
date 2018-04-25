package springlab.SpringLabs;

import java.math.BigDecimal;
import java.util.Scanner;

public class AveArray {

	public static void main(String[] args) {
		int[]a= new int [2];
Scanner input = new Scanner(System.in);
double t = 0;
for (int i = 0; i < a.length; i++) {
	a[i]=input.nextInt();
	t=t+a[i];
}
double I = t/a.length;
System.out.println(I);
int w = input.nextInt();
String bin = Integer.toString(w, 2);
String []gary = bin.split("0");
int tim= 0;
for (int j = 0; j < gary.length; j++) {
	if (gary[j].length()>tim) {
		tim = gary[j].length();
	} else {
		tim = 0;
	}
	System.out.println(gary[j]);
	System.out.println(tim);
}

		}

}

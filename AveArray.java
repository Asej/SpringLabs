package springlab.SpringLabs;

import java.math.BigDecimal;
import java.util.Scanner;

public class AveArray {

	public static void main(String[] args) {
		int[]a= new int [8];
Scanner input = new Scanner(System.in);
double t = 0;
for (int i = 0; i < a.length; i++) {
	a[i]=input.nextInt();
	t=t+a[i];
}
double I = t/a.length;
System.out.println(I);
	}

}

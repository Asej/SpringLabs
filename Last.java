package springlab.SpringLabs;

import java.util.Scanner;

public class Last {
	public static void main(String[] args) {
		int[] course=new int[5];
		Scanner unput= new Scanner(System.in);
		for(int i=0;course.length>i;i++) {
		course[i]=unput.nextInt();	
		}
		System.out.println(course[course.length-1]);
	}
}

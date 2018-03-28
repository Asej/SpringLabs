package springlab.SpringLabs;

import java.util.Scanner;
public class Stingy {

	public static void main(String[] args) {
		String[] course=new String[10];
		Scanner unput= new Scanner(System.in);
		for(int i=0;course.length>i;i++) {
		course[i]=unput.nextLine();	
		}
for(int i=0;course.length>i;i++) {
			System.out.println(course[i]);
		}
	}

}

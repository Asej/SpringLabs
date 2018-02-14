package springlab.SpringLabs;

import java.util.Scanner;

public class uh {

	public static void main(String[] args) {
		System.out.println("wfsc");
		for(int i=1;i<=5;i++) {		
			Scanner input = new Scanner(System.in);
			System.out.println("Type location of library, Type # of books in library, Type # of staff in library,Type yearly expenses");
			Library lib1 = new Library(input.nextLine(),input.nextInt(),input.nextInt(),input.nextDouble());
			input.next();
			Library lib2 = new Library(input.nextLine(),input.nextInt(),input.nextInt(),input.nextDouble());
			input.next();
			Library lib3 = new Library(input.nextLine(),input.nextInt(),input.nextInt(),input.nextDouble());	
			input.next();
			Library lib4 = new Library(input.nextLine(),input.nextInt(),input.nextInt(),input.nextDouble());
			input.next();
			Library lib5 = new Library(input.nextLine(),input.nextInt(),input.nextInt(),input.nextDouble());
			input.next();
			System.out.println(lib1.Location+" "+lib1.Books+" "+lib1.Staff+" "+lib1.expenses);
			System.out.println(lib2.Location+" "+lib2.Books+" "+lib2.Staff+" "+lib2.expenses);
			System.out.println(lib3.Location+" "+lib3.Books+" "+lib3.Staff+" "+lib3.expenses);
			System.out.println(lib4.Location+" "+lib4.Books+" "+lib4.Staff+" "+lib4.expenses);
			System.out.println(lib5.Location+" "+lib5.Books+" "+lib5.Staff+" "+lib5.expenses);

			
			}		
		}

	}

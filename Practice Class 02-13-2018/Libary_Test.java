package springlab.SpringLabs;

import java.util.Scanner;

public class Libary_Test {

	public static void main(String[] args) {
		System.out.println("wfsc");
		for(int i=1;i<=5;i++) {		
			Scanner input = new Scanner(System.in);
			System.out.println("Type location of library");
			String library_location = input.nextLine();
			System.out.println("Type # of books in library");
			int Total_Books = input.nextInt();
			System.out.println("Type # of staff in library");
			int library_staff = input.nextInt();
			System.out.println("Type yearly expenses");
			double Yearly_expenses = input.nextDouble();
			if(i==1) {
				Library lib1 = new Library(library_location, Total_Books, library_staff, Yearly_expenses);
				input.reset();		
				System.out.println(lib1.Location+" "+lib1.Books+" "+lib1.Staff+" "+lib1.expenses);
				System.out.println("Next libary.");
			}
			if(i==2) {
				Library lib2 = new Library(library_location, Total_Books, library_staff, Yearly_expenses);
				System.out.println(lib2.Location+" "+lib2.Books+" "+lib2.Staff+" "+lib2.expenses);
				input.reset();
				System.out.println("Next libary.");
			}
			if(i==3) {
				Library lib3 = new Library(library_location, Total_Books, library_staff, Yearly_expenses);
				System.out.println(lib3.Location+" "+lib3.Books+" "+lib3.Staff+" "+lib3.expenses);
				input.reset();
				System.out.println("Next libary.");
			}
			if(i==4) {
				Library lib4 = new Library(library_location, Total_Books, library_staff, Yearly_expenses);
				System.out.println(lib4.Location+" "+lib4.Books+" "+lib4.Staff+" "+lib4.expenses);
				input.reset();
				System.out.println("Next libary.");
			}
			if(i==5) {
				Library lib5 = new Library(library_location, Total_Books, library_staff, Yearly_expenses);
				System.out.println(lib5.Location+" "+lib5.Books+" "+lib5.Staff+" "+lib5.expenses);
				input.reset();
			}		
		}

	}
}

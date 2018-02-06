package springlab.SpringLabs;

import java.util.Scanner;

public class Books_Test {

	public static void main(String[] args) {
		Scanner book=new Scanner(System.in);
		String Author = book.nextLine();
		int Year= book.nextInt();
		int ISBN= book.nextInt();
		double Price= book.nextDouble();
		book.close();
		Books charlottes_web = new Books ( Author,Year, ISBN, Price);
		Books BFG = new Books ( "disney" ,2017, 1323134, 13.99);
		System.out.println(charlottes_web.BookAuthor+" "+ charlottes_web.BookPrice+ " "+ charlottes_web.BookISBNNumber+" "+charlottes_web.YearPublished);
		System.out.println(BFG.BookAuthor+" "+ BFG.BookISBNNumber+"" + BFG.BookPrice+ " "+BFG.YearPublished) ;
	}

}

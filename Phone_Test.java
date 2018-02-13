package springlab.SpringLabs;

import java.util.Scanner;

public class Phone_Test {

	public static void main(String[] args) {
		Phone S8 = new Phone("Samsung","S8",2017,724.99);
		Phone IPhoneX=new Phone("Apple","IPhoneX",2017,999.99);
		Phone G6= new Phone("LG","G6",2017,650);
		System.out.println(S8.Brand+"'s "+S8.PhoneName+" released in:"+S8.yearReleased);
		System.out.println(IPhoneX.Brand+"'s "+IPhoneX.PhoneName+" released in:"+IPhoneX.yearReleased);
		System.out.println(G6.Brand+"'s "+G6.PhoneName+" released in:"+G6.yearReleased);
		System.out.println("Enter the name of the phone you would like to  buy.");
		Scanner l= new Scanner(System.in);
		String ph= l.nextLine();
		ph.toLowerCase();
		ph.toString();

		switch (ph) {
		case "S8":
			System.out.println("$"+S8.price);
			break;
		case "IPhoneX":
			System.out.println("$"+IPhoneX.price);
			break;
		case "G6":
			System.out.println("$"+G6.price);
			break;



		}}}

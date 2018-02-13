package springlab.SpringLabs;

import java.util.Scanner;

public class CardTest {

	public static void main(String[] args) {
		Card card1Type1= new Card(1,"Club");
		Card card2Type1= new Card(2,"Diamond");
		Card card4Type1= new Card(3,"Ace");		
		Card card3Type1= new Card(4,"Heart");		
		Card card1Type2= new Card(5,"Club");		
		Card card2Type2= new Card(6,"Diamond");		
		Card card3Type2= new Card(7,"Heart");		
		Card card4Type2= new Card(8,"Ace");		
		Card Lucky= new Card(9,"King");		

		System.out.println(card1Type1.Num+card1Type1.St);
		System.out.println(card2Type1.Num+card2Type1.St);
		System.out.println(card3Type1.Num+card3Type1.St);
		System.out.println(card4Type1.Num+card4Type1.St);
		System.out.println(card1Type2.Num+card1Type2.St);
		System.out.println(card2Type2.Num+card2Type2.St);
		System.out.println(card3Type2.Num+card3Type2.St);
		System.out.println(card4Type2.Num+card4Type2.St);
		System.out.println(Lucky.Num+Lucky.St);
		System.out.println("Pick A card number. You win if you pick the lucky card!");
		Scanner input= new Scanner(System.in);
		String suit = new String();
		int card= input.nextInt();
		Scanner inpu= new Scanner(System.in);
		input.close();
		inpu.close();
		if(card==9) {

			if(suit.equals("king")) {
				System.out.println("You Win!:)");
			}else {
				System.out.println("You Lose.:(");
			}
		}else {
			System.out.println("You Lose.:(");

		}

	}}

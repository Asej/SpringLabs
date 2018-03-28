package springlab.SpringLabs;

import java.util.Scanner;

public class Savings_Account {
	String username;
	int pin;		
	static double bal;

	static double amount;
	double balance;
	public Savings_Account(String name, int p, double balanc) {
		username=name;
		pin=p;
		balance=balanc;
	}
	public double Withdraw() {
		return bal-amount;
	}
	public double Deposit() {
		return bal+amount;
	}
	public boolean Overdraft() {
		//if () {

		//}
		return true;
	}
	public static void main(String[] args) {
		Savings_Account Jay = new Savings_Account("Jay",100134,100);
		Savings_Account Aileen = new Savings_Account("Aileen", 100190, 1000);
		Savings_Account John = new Savings_Account("John", 100153,3213);
		Scanner input = new Scanner(System.in);
		
		System.out.println("withdraw or deposit");
		String action = input.nextLine();
		System.out.println("Type pin");
		int key = input.nextInt();
		action.toString();
		//input.next();
		if(action=="withdraw") {
			System.out.println("How much?");
			amount = input.nextDouble();
			if(key==Jay.pin) {
				bal = Jay.balance;
				System.out.println(Jay.username+":"+bal);
			}else if(key == Aileen.pin) {
				bal = Aileen.balance;
				System.out.println(Aileen.username+":"+bal);
			}else if(key == John.pin) {
				bal = John.balance;
				System.out.println(John.username+":"+bal);

			}else {
				System.out.println("Incorrect pin");
			}
		}
		else if(action=="deposit") {
			input.next();
			System.out.println("How much?");
			amount = input.nextDouble();
			if(key==Jay.pin) {
				bal = Jay.balance;
				System.out.println(Jay.username+":"+bal);
			}else if(key == Aileen.pin) {
				bal = Aileen.balance;
				System.out.println(Aileen.username+":"+bal);
			}else if(key == John.pin) {
				bal = John.balance;
				System.out.println(John.username+":"+bal);

			}else {
				System.out.println("Incorrect pin");
			}

		}
	}
}
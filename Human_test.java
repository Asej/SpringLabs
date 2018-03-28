package springlab.SpringLabs;

import java.util.Scanner;

public class Human_test {

	public static void main(String[] args) {
 Scanner person= new Scanner(System.in);
String Fname = person.nextLine();
String Lname = person.nextLine();
String MI = person.nextLine();
String cr = person.nextLine();
person.next();
int age =person.nextInt();
Human anthony= new Human(Fname,Lname,MI,cr,age);
Human anth = new Human(Fname, Lname, MI, cr, age);
person.close();
System.out.println(anthony.Firstname);
	}

}

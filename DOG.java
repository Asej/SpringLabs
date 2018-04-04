package springlab.SpringLabs;

import java.util.Scanner;

public class DOG {
String DogName, DogBreed;
public  DOG(String Name, String Breed) {
	
DogName = Name;
DogBreed = Breed;
}
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tpye 3 dog names and breed");
		String [] dog = new String[3];
		for(int i=0; i<3;i++) 
		{
			dog[i]=(String) DOG(input.nextLine(),input.nextLine());
		}System.out.println(dog[1]);

	}

}

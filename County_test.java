package springlab.SpringLabs;

import java.util.Scanner;

public class County_test {

	public static void main(String[] args) {
		Scanner place= new Scanner(System.in);
		String Name= place.nextLine();
		int Population=place.nextInt();
		int YearEstablished=place.nextInt();
		int LandVoulume=place.nextInt();
		County county1= new County(Name,Population,YearEstablished,LandVoulume);
		
		System.out.println(county1.CountryName+"\n"+ county1.CountryPopulation+"\n"+ county1.CountryYearEstablished+"\n"+ county1.CountryLandVoulume);;
	}

}

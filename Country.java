package springlab.SpringLabs;

import java.io.PrintStream;

public class Country {
String names;
int pop;
double areas;
	public Country(String name, int population, double area) {
		names=name;
		pop=population;
		areas=area;
	}
	public static void ComparePopualtion(String nm, int one, String n1m, int two) {
		String namez = "";
		if(one>two) {
			namez = nm ;
		}else {
			namez = n1m;
		}
		
		System.out.println(namez+ " has the greater population.");
		
	}
	public static void main(String[] args) {
		Country asia = new Country("China", 1000100, 37050000);
		Country Northam = new Country("America", 32332323, 400000000);
		System.out.println("Name: "+ asia.names+" pop.: "+ asia.pop+" area: " + asia.areas+ "sqr. ft");
		System.out.println("Name: "+ Northam.names+" pop.: "+ Northam.pop+" area: " + Northam.areas+ "sqr. ft");

		ComparePopualtion(asia.names, asia.pop, Northam.names, Northam.pop);
	}

}

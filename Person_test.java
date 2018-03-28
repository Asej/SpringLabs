package springlab.SpringLabs;

public class Person_test {

	public static void main(String[] args) {
		Person ant= new Person("ant",18);
		System.out.println(ant.isAdult());
		Person tim= new Person("tim",128);
		System.out.println(tim.isAdult());
	}

}

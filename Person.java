package springlab.SpringLabs;

public class Person {
		String name;
		int age;
	public Person(String nm, int ag) {
		name=nm;
		age=ag;
	}
	public boolean isAdult() {
		if (age>=18) {
			return true;	
		}else {
			return false;
		}
		
		
	}

}

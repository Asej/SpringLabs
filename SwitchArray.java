package springlab.SpringLabs;

public class SwitchArray {

	public static void main(String[] args) {
		String [] pets = {"Dog","Cat","Parrot","Fish"};
		String a = pets[0];
		pets[0]=pets[3];
		pets[3]=a;
				for (int i = 0; i < pets.length; i++) {
					System.out.println(pets[i]);
				}
	}

}

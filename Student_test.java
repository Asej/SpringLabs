package springlab.SpringLabs;

import java.util.Scanner;

public class Student_test {

		public static void main(String[] args) {

			Student anthony = new Student("Anthony","Francis","Smith", 4567,"","");
			Student alexus = new Student("Alexus","Cristina", "Stone", 7895,"","");
			
			Scanner input = new Scanner(System.in); 
			System.out.println("Login:");
			String name = input.nextLine();
			//if(name == )
			System.out.println("Hello "+anthony.Fullname()+" . How are you?"+" Type number"+"\n 1. View name, Major, classification \n 2. set Major \n 3. set Classification \n 4. Exit");
			
			for(int option = input.nextInt();option<=4;) {
				
				if(option == 1) {
					System.out.println(anthony.One());
					
					break;
			}else if (option == 2) {
				String sMajor = input.nextLine();
				anthony.setMajor(sMajor);
				break;
			}else if(option == 3) {
				anthony.setClasification(input.nextLine());
			}
			
			
		} 

	}

}

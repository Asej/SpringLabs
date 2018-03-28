package springlab.SpringLabs;

import java.util.Scanner;

public class Student {
	String FirstName;
	String middleIntial;
	String LastName;
	int StudentID;
	String Classification;
	String sMajor;

	public Student(String First, String MI, String Last, int SI, String Class, String Major) {
		FirstName = First;
		LastName = Last;
		middleIntial = MI;
		StudentID = SI;
		Classification = Class;
		sMajor = Major;
	}
	public String Fullname() {
		return FirstName+ " "+ middleIntial +" "+ LastName ;
	}
	public String One() {
		return FirstName +" "+ LastName+" " + sMajor+" "+ Classification ;
	}
	public void setMajor(String major) {
		sMajor= major;
	}
	public void setClasification(String Class) {
		Classification = Class;
	}
}

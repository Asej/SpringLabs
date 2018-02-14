package springlab.SpringLabs;

public class Smallest {
	public static void main(String[] args) {
		
		System.out.println(small(82,64));
		System.out.println(small(2,221));
		System.out.println(small(18,31));
	}
	public static int small(int a, int b) {
		int small;
		if (a>b) {
			small= b;
		}else {
			small=a;
		}
		
		return small;
		
	}
}

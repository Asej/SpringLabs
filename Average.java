package springlab.SpringLabs;

public class Average {

	public static void main(String[] args) {

		System.out.println("the average is"+ave(72,6,91));
		System.out.println("the average is"+ave(200,1,117));
	}
public static int ave(int a, int b, int c) {
	return (a+b+c)/3;
}
}

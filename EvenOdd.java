package springlab.SpringLabs;

public class EvenOdd {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			boolean c = num(i);
			System.out.println(c);
			}
	}
public static boolean num (int a) {
	if (a%2==0||a==0) {
	return true;	
	}else {
		return false;
	}

}
}
package springlab.SpringLabs;

public class Oddto500 {

	public static void main(String[] args) {
for(int i = 11; i<500;i+=2) {
	if(i%3!=0&&i%5!=0) {
		System.out.println(i);
	}
}
	}

}

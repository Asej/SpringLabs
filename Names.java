package springlab.SpringLabs;

public class Names {

	public static void main(String[] args) {
		String[]names= {"John","Alex","Hector"};
		for (int i = 0; i < names.length; i++) {
			if(names[i].charAt(0)=='A') {
				System.out.println(names[i]);
			}
		}
	}

}

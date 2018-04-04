package springlab.SpringLabs;

public class AddArr {

	public static void main(String[] args) {
		int [] gr1 = {2,3224,35,434,3,34};
		int [] gr2 = {43,434,33,343,143,232};
		int [] gr3 = new int[10];
	
		for (int i = 0; i < gr2.length; i++) {
			gr3[i] = gr1[i]+gr2[i];		
			System.out.println(gr3[i]);
		}

	}

}

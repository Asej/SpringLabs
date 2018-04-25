package springlab.SpringLabs;

public class Arrayaddd {

	public static void main(String[] args) {
int []one = {5,2,8,23,14};
int []two = {67,32,7,4,6};
int []sum = new int [one.length];
for (int i = 0; i < sum.length; i++) {
	sum[i]=one[i]+two[i];
}for (int i = 0; i < sum.length; i++) {
	System.out.println(sum[i]);
}

	}

}

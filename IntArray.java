package springlab.SpringLabs;

import java.util.Arrays;

public class IntArray {

	public static void main(String[] args) {
		int[] num = {1,23,32,2,4};
		Arrays.sort(num);
		for (int i= 0; num.length - 1 >=i;i++)
		System.out.print(num[i]+" ");
	}

}

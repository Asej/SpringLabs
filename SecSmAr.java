package springlab.SpringLabs;

import java.util.Arrays;

public class SecSmAr {

	public static void main(String[] args) {
		int[]nums= {23232,232,23,32,32,2,32,1,323233232};
		Arrays.sort(nums);
int a =nums[0];
		int s = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]<a) {
				s=a;
				a=nums[i];

			}
		}System.out.println(nums[1]);
	}

}
package springlab.SpringLabs;

public class largeArray {

	public static void main(String[] args) {
int[]nums= {23232,232,23,32,32,2,32,1,323233232};
int a =nums[0];
for (int i = 0; i < nums.length; i++) {
if(nums[i]>a) {
	a=nums[i];
}
}System.out.println(a);
	}

}

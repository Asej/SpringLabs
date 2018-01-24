package springlab;

public class SumandAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int sum=1;
		for(int i=3;i<=99;i+=1) {
			
			if(i%3==0) {
			num+=1;
			System.out.println(sum); 
			sum+=i;	
			}
		}	System.out.println("Sum ="+sum+". Average = "+ sum/num );
		
	}

}

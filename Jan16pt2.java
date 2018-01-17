package springlab;

public class Jan16pt2 {

	public static void main(String[] args) {
		String C= "Coza";
		String L= "Loza";
		String W= "Woza";
		for(int i=1;i<=33;i++) {
			if(i%3==0) {
				if(i%5==0) {
					System.out.print(C+L+" ");

				}else if(i%7==0) {
					System.out.print(C+W+" ");

				}else {
				System.out.print(C+" ");
				}
			}///////////
			else if(i%5==0) {
				if(i%7==0) {
					System.out.print(L+W+" ");}
						else{System.out.print(L+" ");
			}
				}
			else if(i%7==0) {
				System.out.print(W+" ");	
			}
			else if(i%11==0) {
				System.out.print(i+"\n");
			}
			else {
				System.out.print(i+" ");
			}
		}
	}

}

package springlab.SpringLabs;

import java.util.Arrays;

public class StringArr {

	public static void main(String[] args) {
		String[] val= {"Fred","rick","tim","Ant","jesus","lex"};
		Arrays.sort(val);
		Arrays.spliterator(val);
		for (int i= 0; val.length - 1 >=i;i++)
			System.out.print(val[i]+" ");
	}

}

package problem_01;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);

		//nesne olusturma
		twosum twosum1 = new twosum();
		
		//nesne uzerinden metot cagirma
		int[] resultArray= twosum1.twosumCalculate();
		
		//metodun dondurdugu degeri yazdirma
		for (int element : resultArray) {
			System.out.println("["+element+"]");
		}

	}

}

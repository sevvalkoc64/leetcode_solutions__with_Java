package problem_02;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		add_two_numbers add_two_numbers1 = new add_two_numbers();
		
		int result[] = add_two_numbers1.addTwoNumbersCalculate();
		System.out.println("--------result---------");
		for (int element : result) {
			System.out.println(element);
		}
		
	}

}









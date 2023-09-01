package problem_02;

import java.util.Scanner;

public class add_two_numbers {

	Scanner scanner = new Scanner(System.in);
	
	public int[] createArray1() {
		int[] array1 = new int[3];
		return array1;
	}
	
	public int[] createArray2() {
		int[] array2 = new int[3];
		return array2;
	}
	
	public int[] createSumArray() {
		int[] sumArray = new int[3];
		return sumArray;
	}
	
	public int[] array1EnterElement(){
		int[] array1= createArray1();
		for(int i=0;i<array1.length;i++) {
			System.out.println("please enter array1's "+i+". element:");
			array1[i]= scanner.nextInt();
		}
		return array1;
	}
	
	public int[] array2EnterElement() {
		int[] array2 = createArray2();
		for(int i=0; i<array2.length; i++) {
			System.out.println("please enter array2's "+i+". element:");
			array2[i]=scanner.nextInt();
		}
		return array2;
	}
	
	public int[] addTwoNumbersCalculate() {
		int[] array1 = array1EnterElement();
		int[] array2 = array2EnterElement();
		int[] sumArray = new int[3];
		
		for(int i=0; i<sumArray.length;i++) {
			sumArray[i]= array1[i]+array2[i];
		}
		return sumArray;
	}
}
















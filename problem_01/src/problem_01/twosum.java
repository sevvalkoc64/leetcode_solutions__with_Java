package problem_01;

import java.util.Scanner;

public class twosum {

	public int enterLength() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter array length: ");
		int n= scanner.nextInt();
		return n;
	}
	
	public int[] createArray() {
		
		int n= enterLength();
		int[] array= new int[n];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.println("please enter the array's "+i+". element: ");
			array[i]= scanner.nextInt();
		}
		return array;
	}
	
	public int enterTarget() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter target value: ");
		int target = scanner.nextInt();
		
		return target;
	}
	
	public int[] twosumCalculate() {
		int i, j= 0;
		int[] array= createArray();
		int target=enterTarget();
		int[] resultArray = new int[2];
		
		for(i=0;i<array.length;i++) {
			for(j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==target){
					resultArray[0]=i;
					resultArray[1]=j;
				}
			}
		}
		return resultArray;
	}
	
}

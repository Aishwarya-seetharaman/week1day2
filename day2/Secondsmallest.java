package week1.day2;

import java.util.Arrays;

public class Secondsmallest {
	
	//Find the Second smallest number in the array {23,45,67,32,89,22 }

	public static void main(String[] args) {
		int[] num = {23,45,67,32,89,22 };
		Arrays.sort(num);
		System.out.println(num[1]);
		

	}

}

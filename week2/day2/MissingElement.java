package week2.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,7,6,8};
		Arrays.sort(arr1);
		for (int i = 1; i < arr1.length; i++) {
			if(i != arr1[i-1]) {
				System.out.println("The missing element is :"+i);
				break;
			}
		}
	}

}

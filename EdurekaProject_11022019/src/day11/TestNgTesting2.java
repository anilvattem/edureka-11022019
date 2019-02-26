package day11;

import org.testng.annotations.Test;

public class TestNgTesting2 {
  
	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void verifyingExpectedException() {
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		arr[3] = 18;
		arr[5] = 16;
		
		for(int i=0; i<=5; i++) {
			System.out.println(arr[i]);
		}
	}
}
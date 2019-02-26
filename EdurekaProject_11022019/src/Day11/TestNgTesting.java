package Day11;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgTesting {
 
	@Test(priority=0)
	public void testCase1() {
		System.out.println("\t Executing Test Case1");
	}
		
	@Test(priority=3)
	public void testCase2() {
		System.out.println("\t Executing Test Case2");
	}
	
	@Test(priority=6)
	public void testCase4() {
		System.out.println("\t Executing Test Case4");
	}
	
	@Test(priority=2)
	public void testCase5() {
		System.out.println("\t Executing Test Case5");
	}
	
	@Test(priority=1, enabled=false)
	public void testCase10() {
		System.out.println("\t Executing Test Case9");
	}
	
	@Test(priority=-3, enabled=true)
	public void testCase9() {
		System.out.println("\t Executing Test Case9");
  }
	
	@BeforeMethod
	public void beforAMethod() {
		System.out.println("\t\t\t Executes before a test case");
	}
	
	@AfterMethod
	public void afterAMethod() {
		System.out.println("\t\t\t Executes after a test case");
		System.out.println("-----------------------------------");
	}
	
	@BeforeClass
	public void beforeAClassLoads() {
		System.out.println("First method to be executed when a class loads");
		
	}
	
	@AfterClass
	public void afterAClass() {
		System.out.println("Last method to be executed in a class");
		
	}
}
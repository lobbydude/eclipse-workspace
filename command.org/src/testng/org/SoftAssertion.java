package testng.org;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	
	@Test
	public void softAssert(){
		SoftAssert softAssertion= new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertTrue(false);
		System.out.println("softAssert Method Was Executed");
	}
	
	@Test
	public void hardAssert(){
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Was Executed");
	}
}

//(methods)
//	
//	
//	@BeforeTest
//	@AfterTest
//	@BeforeClass
//	@AfterClass
//	@BeforeMethod
//	@AfterMethod
//	@BeforeSuite
//	@AfterSuite
//	@BeforeGroups
//	@AfterGroups
//	@Test\

//Some of the common assertions supported by TestNG are
//
//assertEqual(String actual,String expected)
//assertEqual(String actual,String expected, String message)
//assertEquals(boolean actual,boolean expected)
//assertTrue(condition)
//assertTrue(condition, message)
//assertFalse(condition)
//assertFalse(condition, message)



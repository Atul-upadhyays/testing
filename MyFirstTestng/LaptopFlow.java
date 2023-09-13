package MyFirstTestng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaptopFlow {
	
	@BeforeSuite
	public void bs() {
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void as() {
		System.out.println("AfterSuite");
	}
	
	
	@BeforeTest
	public void bt() {
		System.out.println("BeforeTest1");
	}
	@AfterTest
	public void at() {
		System.out.println("AfterTest1");
	}
	
	
	@BeforeClass
	public void hh() {
		System.out.println("Beforeclass1");
	}
	
	@AfterClass	
	public void h() {
		System.out.println("afterclass1");
	}
@BeforeMethod
public void hhii() {
	System.out.println("BeforeMethod1");
}

@AfterMethod
public void hi() {
	System.out.println("AfterMethod1");
}




@Test
	public void signUp() {
	System.out.println("signUp with valid detail");}

@Test
public void login() {
System.out.println("login with valid detail");}

@Test
public void selectMobileCategory() {
System.out.println("select mobile category");}

@Test
public void addToCart(){
System.out.println("add apple mobile to cart");}

@Test
public void fillShippingDetail() {
System.out.println("fill shipping detail where you want to deliver a product.");}

@Test

public void makePayment() {
System.out.println("then make payment using different payment mode (example credit/debit card)");}

@Test
public void orderTracking() {
System.out.println("order tracking after successfully payment in step 6");}

@Test
public void reviewAndRating() {
System.out.println("Finally review and rating of product.");}

}

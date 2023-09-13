package MyFirstTestng;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//@Test(run whole class without object creation , if you give test annotation here than you don't need to give annotation for method,  and giving priority then test case execute by alphabatic order)
//@Ignore whole class

public class AppleMobileFlow {
	//1. signUp with valid detail
	//2. login with valid credentials that we create in step 1
	//3. select mobile category
	//4. add apple mobile to cart
	//5. fill shipping detail where you want to deliver a product.
	//6. then make payment using different payment mode (example credit/debit card)
	//7. order tracking after successfully payment in step 6
	//8. Finally review and rating of product.
	@BeforeGroups(groups = "sanity")
	public void beforeGroups() {
		System.out.println("beforegoups");} 
	

	
	@BeforeMethod(groups = "sanity")
	public void beforeMethod() {
		System.out.println("this is sanity testing, test case");
	}

// dependsOnMethods :- if one test case fail then other test skip if we use dependsOnMethods )
//priority=0 means run test code sequencewise
	@Parameters("browsername")
	
@Test(groups =  {"e2e", "regression","smoke","sanity"})
	public void signUp(@Optional ("chrome") String browsername) {
	System.out.println("signUp with valid detail"+ browsername);
	
}

	//@Ignore(not picking execution and not count, reccomdation :- use for class level, enable work like this but use only for test case(method) level only)
	//@Test(priority=1, invocationCount=20, description= "login with valid user name that has created in signup step(this is use for showing test case info in html report" , timeOut= 60000) 
	//enabled = false)
@Test(groups =  {"e2e", "regression","sanity"})
public void login()
//throws Exception
{
	//Thread.sleep(8000); sir show in  video but not working
System.out.println("login with valid detail");
//throw new Exception();
}
@Test( groups =  {"e2e", "smoke","sanity"})
public void selectMobileCategory() {
System.out.println("select mobile category");

}

@Test( groups =  { "regression","smoke"})
public void addToCart()
//throws Exception this method is not running in dependson condition but this method  is failure and other one is skip)
{
System.out.println("add apple mobile to cart");
//throw new Exception();
}

@Test(groups =  {"e2e", "regression","smoke"})
	//ependsOnMethods = { "addToCart"}, not use dependson with groups only use priority for sequence

public void fillShippingDetail() {
System.out.println("fill shipping detail where you want to deliver a product.");

}

@Test( groups =  {"e2e", "regression","smoke"})

public void makePayment() {
System.out.println("then make payment using different payment mode (example credit/debit card)");

}

@Test(groups =  { "regression","sanity"})
public void orderTracking() {
System.out.println("order tracking after successfully payment in step 6");

}

@Test(groups =  {"e2e", "sanity"})
public void reviewAndRating() {
System.out.println("Finally review and rating of product.");

}


}

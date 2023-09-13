package NewPackage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//@Ignore
public class New {
	@Parameters("browserName")
	@BeforeClass
	public void selectMobile(@Optional("chrome") String browserName  ) {
	System.out.println(browserName);	
	}
	
	@Test(priority=0, description = "this is for registration" , invocationCount = 2, timeOut = 500)
	public void register() {
		System.out.println("register");
	}
	

	@Test( dependsOnMethods= "register")
	public void login() {
		System.out.println("Login");
	}
	
	
	@Test(priority=2, groups = {"sanity"} )
	public void selectMobile( ) {
	System.out.println("selectMobile");	
	}
	

	@Test(priority=3 , groups = {"sanity" , "smoke"})
	public void addToCart() {
			System.out.println("addToCart");
	}
	
	@Test(priority=2, groups = {"smoke"})
	public void buy() {
		System.out.println("buy");
	}
	
	@Test(enabled=false)
	public void address() {
		System.out.println("address");
	}
	
	@Test(enabled=false)
	public void makePayment() {
		System.out.println("makePayment");
	}
	
	@Test(enabled=false)
	public void trackOrder() {
		System.out.println("trackOrder");
	}
	@Test(enabled=false)
	public void rateAndReview() {
		System.out.println("rateAndReview");
	}
	
}



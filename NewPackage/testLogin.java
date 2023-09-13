package NewPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testLogin {

	@Test(dataProvider= "loginData")
	public void login(String username, String password) {
		System.out.println("hii login successfully" + username + " " + password);
	}
	
	@DataProvider(name = "loginData")
	public Object[][] loginData(){
		Object[][] user = {{"ram","ram@123"},{"shyam","shyam@12345"},{"sonu", "sonu@12"}};
		return user;
	}
	
}

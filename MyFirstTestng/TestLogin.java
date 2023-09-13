package MyFirstTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin {
@Test(dataProvider= "userLoginData")
public void login(String username, String password) {
	System.out.println("username = " + username+ "password" + 
			password);
	
}

@DataProvider(name= "userLoginData")
public Object[][] userLoginData(){
	Object[][] user = {{"ram","ram@123"},{"shyam","shyam@12345"}
	,{"sonu", "sonu@12"}};
	
	return user;
}
}

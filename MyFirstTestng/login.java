package MyFirstTestng;

import org.testng.annotations.Test;

public class login {
@Test(dataProvider = "LoginPage")
public void login(String Username , String password) {
	System.out.println("Username" + Username +"password" + password);
	
}
}

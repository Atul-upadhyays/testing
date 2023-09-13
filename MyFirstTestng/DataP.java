package MyFirstTestng;

import org.testng.annotations.DataProvider;

public class DataP {
@DataProvider(name=  "LoginPage")
public Object [][] userData(){
	Object [][] user = {{"ram","ram@123"},{"shyam","shyam@12345"}
	,{"sonu", "sonu@12"}};
	return user;}
}



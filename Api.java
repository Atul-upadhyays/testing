package apiRestAssured;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.assertion.ResponseTimeMatcher;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import java.io.File;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.Matchers.greaterThan;

public class Api {
	// check this api for get and put

//    String token = "";

//   RestAssured.given().header("authorization", "bearer " + token);
	
	
	String Url = "http://192.168.3.23:8000/candidate-status/candidate-status/";

	Response response = RestAssured.get(Url);
   
	@Test
	public void post() {
		Response response2 = RestAssured.post(Url);
		try {
			response2.then().assertThat().statusCode(greaterThan(200));
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Status Code post: " + response2.statusCode() + "\nResponse Body: " + response2.asString());
		}
	}
  
	@Test
	public void put() {
		Response response3 = RestAssured.put(Url);
		try {
			response3.then().assertThat().statusCode(equalTo(200));
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Status Code put: " + response3.statusCode() + "\nResponse Body: " + response3.asString());
		}
		
	}
   
	@Test
	public void delete() {
		Response response4 = RestAssured.delete(Url);
		System.out.println();
		try {
			response4.then().assertThat().statusCode(greaterThan(200));
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Status Code delete: " + response4.statusCode() + "\nResponse Body: " + response4.asString());
		}
		
		
	}

	@Test
	public void bodyVerify() {
		System.out.println(response.asPrettyString());
		response.then().assertThat().body("data.id", equalTo(3));
		// if you validate more data,"data.id", equalTo(2)); one thing remember if in
		// response body have nested data then use . for mention location
	}

	@Test
	public void resCode() {
		// for validate status code
		response.then().assertThat().statusCode(200);
	}

	@Test
	public void resTime() {

		response.then().assertThat().time(lessThan(2L), TimeUnit.SECONDS);
		// always mention L as long datatype in time as a suffix beacuase matcher
		// interpreted time as long so reduce error
	}
	@Ignore
	   @Test
	    public void resbody() {
	        // Perform the POST request and attach the JSON file as the request body
	        Response response = RestAssured.given()
	                .header("Content-Type", "application/json")
	                .body(new File("C:\\Users\\Atul\\Downloads\\ap.json"))
	            .when()
	                .post("https://reqres.in/api/users");

	        // Validate the Response
	        response.then()
	                .statusCode(201);
	                 // Adjust based on your actual response
	    }

}


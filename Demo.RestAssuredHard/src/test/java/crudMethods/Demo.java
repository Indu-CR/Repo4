package crudMethods;

//import org.json.simple.JSONObject;
//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

//import io.cucumber.core.gherkin.vintage.internal.gherkin.deps.com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//import junit.framework.Assert;

public class Demo {
	Response res=null;
	//@Ignore
	@Test(priority=1)
	 public void myFirstTest()
	 {
		 RestAssured.baseURI=("https://reqres.in/est");
		 res=given().
			param("page","2").
		 when().
		 	get("https://reqres.in/api/users.jason").
		 then().
		 	assertThat().statusCode(200).extract().response();
		 System.out.println(res);
		 String myStr=res.asString();
		 System.out.println(myStr);
	 }
	//@Ignore
	@Test(priority=2)
	public void mySecondTest()
	{
		RestAssured.baseURI=("https://reqres.in/est");
		res=given().
			param("id","2").
		when().
			get("https://reqres.in/api/users/").
		then().
			assertThat().statusCode(200).extract().response();
		System.out.println(res);
		String myStr=res.asString();
		System.out.println(myStr);
	}
	//@Ignore
	@Test(priority=3)
	public void myThirdTest()
	{
		RestAssured.baseURI="https://reqres.in/est";
		res=given().
			param("id","23").
		when().
			get("https://reqres.in/api/users").
		then().
			assertThat().statusCode(404).extract().response();
		System.out.println(res);
		String myStr=res.asString();
		System.out.println(myStr);
	}
	//@Ignore
	@Test(priority=4)
	public void myFourthTest()
	{
		RestAssured.baseURI="https://reqres.in/est";
		res=given().
		when().
			get("https://reqres.in/api/unknown").
		then().
			assertThat().statusCode(200).extract().response();
		System.out.println(res);
		String myStr=res.asString();
		System.out.println(myStr);
	}
	//@Ignore
	@Test(priority=5)
	public void myFifthTest()
	{
		/*RestAssured.baseURI="https://reqres.in/est";
		res=null;
		try
		{
		   res=RestAssured.given()
		   .when()
		   .get("https://reqres.in/api/unknown/2");
		 } 
		catch(Exception e)
		{
		   e.printStackTrace();
		}
		System.out.println("Response :" + res.asString());
		System.out.println("Status Code :" + res.getStatusCode()); */
		
		RestAssured.baseURI="https://reqres.in/est";
		res=given().
		when()
			.get("https://reqres.in/api/unknown/2").
		then().
			assertThat().statusCode(200).extract().response();
		System.out.println(res);
		String myStr=res.asString();
		System.out.println(myStr);
	}
	//@Ignore
	@Test(priority=6)
	public void mySixthTest()
	{
		RestAssured.baseURI="https://reqres.in/est";
		res=given().
			param("id","23").
		when().
			get("https://reqres.in/api/unknown/");
		//then().
			//assertThat().statusCode(404).extract().response();
		System.out.println("Response:"+res.asString());
		System.out.println("StatusCode:"+res.getStatusCode());
	}
}

package crudMethods;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class DemoDelete {
	@Test(priority=1)
	public void myTwelvethTest()
	{
		RestAssured.baseURI="https://reqres.in/est";
		RequestSpecification req=RestAssured.given();
		req.header("Content-type","application/json");
		JSONObject json=new JSONObject();
		Response response=req.delete("https://reqres.in/api/users/2");
		System.out.println(req);
		String myStr=response.asString();
		System.out.println(myStr);
		int code=response.statusCode();
		Assert.assertEquals(code,204);
		Assert.assertEquals(myStr.contains(""),true);
		//Assert.assertEquals(myStr.contains("Successfully deleted records"),true);
	}
}

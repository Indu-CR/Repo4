package crudMethods;

import org.json.simple.JSONObject;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class DemoPost
{
		@Test(priority=1)
		public void mySeventhTest()
		{
			RestAssured.baseURI="https://reqres.in/est";
			RequestSpecification req=RestAssured.given();
			req.header("Content-type", "application/json");
			JSONObject json=new JSONObject();	
			json.put("name","indu");
			json.put("job","trainee qe");
			req.body(json.toJSONString());
			Response response=req.post("https://reqres.in/api/users");
			int code=response.statusCode();
			System.out.println("Status code is "+code);
			Assert.assertEquals(code, 201);
			System.out.println(req);
			String myStr=response.asString();
			System.out.print(myStr);
		}
		@Test(priority=2)
		public void myEighthTest()
		{
			RestAssured.baseURI="https://reqres.in/est";
			RequestSpecification req=RestAssured.given();
			req.header("Content-type","application/json");
			JSONObject json=new JSONObject();
			json.put("email","eve.holt@reqres.in");
			json.put("password","pistol");
			req.body(json.toJSONString());
			Response response=req.post("https://reqres.in/api/register");
			System.out.println(req);
			String myStr=response.asString();
			System.out.println(myStr);
			int code=response.statusCode();
			Assert.assertEquals(code,200);
		}
		@Test(priority=3)
		public void myNinthTest()
		{
			RestAssured.baseURI="https://reqres.in/est";
			RequestSpecification req=RestAssured.given();
			req.header("Content-type","application/json");
			JSONObject json=new JSONObject();
			json.put("email","sydney@fife");
			req.body(json.toJSONString());
			Response response=req.post("https://reqres.in/api/register");
			System.out.println(req);
			String myStr=response.asString();
			System.out.println(myStr);
			int code=response.statusCode();
			Assert.assertEquals(code,400);
		}
		@Test(priority=4)
		public void myTenthTest()
		{
			RestAssured.baseURI="https://reqres.in/est";
			RequestSpecification req=RestAssured.given();
			req.header("Content-type","application/json");
			JSONObject json=new JSONObject();
			json.put("email","eve.holt@reqres.in");
			json.put("password","cityslicka");
			req.body(json.toJSONString());
			Response response=req.post("https://reqres.in/api/login");
			System.out.println(req);
			String myStr=response.asString();
			System.out.println(myStr);
			int code=response.statusCode();
			Assert.assertEquals(code,200);
		}
		@Test(priority=5)
		public void myEleventhTest()
		{
			RestAssured.baseURI="https://reqres.in/est";
			RequestSpecification req=RestAssured.given();
			req.header("Content-type","application/json");
			JSONObject json=new JSONObject();
			json.put("email","peter@klaven");
			req.body(json.toJSONString());
			Response response=req.post("https://reqres.in/api/login");
			System.out.println(req);
			String myStr=response.asString();
			System.out.println(myStr);
			int code=response.statusCode();
			Assert.assertEquals(code,400);
		}
}

package com.restAssured;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.cliftonlabs.json_simple.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post {
@Test
public void create() {
	//RestAssured.baseURI="https://reqres.in/";
   // RequestSpecification specify=RestAssured.given();

//post method
/*JsonObject ob=new JsonObject();
ob.put("name","morpheus" );
ob.put("job","leader" );
ob.put("email","lingarajgc102@" );
specify.header("Content-Type","application/json").body(ob.toJson());
Response response=specify.request(Method.POST,"api/users");
System.out.println(response.getBody().asString());
System.out.println(response.getStatusCode());
Assert.assertEquals(response.getStatusCode(), 201);*/

//sending payload using hashmap
HashMap map=new HashMap();
map.put("name", "morpheus");
map.put("job", "leader");
/*specify.header("Content-Type", "application/json").body(map.toString());
Response response=specify.request(Method.POST,"api/users");
System.out.println(response.getBody().asString());
System.out.println(response.getStatusCode());
Assert.assertEquals(response.getStatusCode(), 201);*/

//BDD style
given().
.ContentType("application/json")
.body(map)






























/*//get method
//Response response=specify.request(Method.GET,"api/users/2");
Response response=specify.request(Method.GET,"api/unknown");
System.out.println(response.getBody().asString());
System.out.println(response.getStatusCode());
Assert.assertEquals(response.getStatusCode(), 200);*/

//put method
/*JsonObject ob=new JsonObject();
ob.put("id","2" );
ob.put("name","Jane" );
ob.put("job","Weaver" );
specify.header("Content-Type","application/json").body(ob.toJson());
Response response=specify.request(Method.PUT,"api/users/2");
System.out.println(response.getBody().asString());
System.out.println(response.getStatusCode());
Assert.assertEquals(response.getStatusCode(), 200);*/

}

private void given() {
	// TODO Auto-generated method stub
	
}
	
	
	
	
	
}

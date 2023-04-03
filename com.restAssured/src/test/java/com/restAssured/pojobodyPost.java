package com.restAssured;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class pojobodyPost {
@Test
public void createbody() throws JsonProcessingException {
	//creating an object of pojo class
	employdetails details=new employdetails();
	details.setFirstname("James");
	details.setLastname("Brown");
	details.setTotalprice(111);
	//converting java class object to json payload as string 
	ObjectMapper mapper= new ObjectMapper();
	String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(details);
	System.out.println(json);
	
RestAssured.baseURI="https://restful-booker.herokuapp.com/";
RequestSpecification specify=RestAssured.given();
Response response=specify.header("Content-Type","application/json").header("Accept","application/json").body(details).post("/booking");
System.out.println(response.asPrettyString());
try {
response.then().assertThat().statusCode(200);
JsonPath jp=JsonPath.from(response.asPrettyString());
System.out.println(jp.get("bookingid").toString());
}catch(AssertionError e){
	System.out.println("get result");
}
}}

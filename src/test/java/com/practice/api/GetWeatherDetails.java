package com.practice.api;

import io.restassured.specification.RequestSpecification;

public class GetWeatherDetails {
	
	public void getWeatherDetails()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		 /*Get the RequestSpecification of the request that you want to sent
		 to the server. The server is specified by the BaseURI that we have
		 specified in the above step*/
		RequestSpecification httpRequest = RestAssured.given();
		
		/*Make a request to the server by specifying the method Type and the method URL.
		This will return the Response from the server. Store the response in a variable.*/
		Response res = httpRequest.request(Method.GET, "/Hyderabad");
		System.out.println("Response is: " +res);
		
		/*Extracting response and printing the same	*/	
		String response = res.getBody().asString();
		System.out.println("Response body is: " +response);
	}

}

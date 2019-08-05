package com.app.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClinetTest {
public static void main(String[] args) {
	String url="http://localhost:8006/EmpProducerEx1/rest/emp/show";
	//1.create an empty object
	 Client c=Client.create();
	//2.add url to client
	WebResource wr=c.resource(url);
	//3. make a request call
	  ClientResponse  cr=wr.get(ClientResponse.class);
	  //4.read entity
	  String str=cr.getEntity(String.class);
	//5 print entity
	  System.out.println(str);
	System.out.println(cr.getStatus());
	System.out.println(cr.getStatusInfo());
	
	
	
	
	
	
	
	
	
	
	
	
}
}

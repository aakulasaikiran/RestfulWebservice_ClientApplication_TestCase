package com.nt.lsn.test;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class Test {

	public static void main(String[] args) {
		String URL="http://localhost:8080/Restful_Jersey_QueryParamExamples/ProductService/getProductinJSON?pid=301";
		
		Client client=Client.create();
WebResource webResource=client.resource(URL);
	Builder builder=webResource.accept(MediaType.APPLICATION_JSON);
		ClientResponse response=builder.get(ClientResponse.class);
		String jsonResponse=response.getEntity(String.class);
		System.out.println(response.getStatus()+"-->"+response.getStatusInfo());
		
		System.out.println(jsonResponse);
		
	}

}

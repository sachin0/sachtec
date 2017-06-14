package com.journaldev.spring;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.web.client.RestTemplate;

import com.example.Example;
import com.example.Fields;
import com.example.Record;

@Path("/message")
public class rswServices {
 
  @GET
  @Produces("text/html")
  public Response getLocalCust() {
 
           String output = "I am from 'getLocalCust' method";
           return Response.status(200).entity(output).build();
  }
 
  @GET
  @Path("/new")
  @Produces("text/html")
  public Response getNriCust() {
	 
            String output = "I am from 'getNriCust' method";
            return Response.status(200).entity(output).build();
  }
  
 @Path("/pd")
  @GET
  @Produces({MediaType.APPLICATION_JSON})  //add MediaType.APPLICATION_XML if you want XML as well (don't forget @XmlRootElement)
  public String getPerson(){
	//  URL myURL = new URL("https://jsonplaceholder.typicode.com/posts/1");
	      try {  
	    	  Example quote=new Example();
	    	  RestTemplate restTemplate = new RestTemplate();
	    	  Record qquote = restTemplate.getForObject("https://data.gov.in/api/datastore/resource.json?resource_id=c3f28ee5-ffea-4a11-9425-5ba317c37e76&api-key=54902c06ecce0a4ec0e633b918e22d73",Record.class);
	         System.out.print(quote);
	      }
	catch(Exception e){
		System.out.print(e);
	}
		return null;      
  }
}
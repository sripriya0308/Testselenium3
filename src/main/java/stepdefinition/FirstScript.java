package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.data.test.ApiBody;
import org.json.JSONObject;
import org.openqa.selenium.json.JsonException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FirstScript {
	
	@Given("^Fetch details using GET \"([^\"]*)\" and \"([^\"]*)\"$")
	public void start(String url, String apiurl) throws Throwable, ClientProtocolException, IOException,NullPointerException{
		
		System.out.println("Starting GET request");
		String newurl=url+apiurl;
		CloseableHttpClient cl=	HttpClients.createDefault();
		HttpGet hg=new HttpGet(newurl);
		CloseableHttpResponse cr=cl.execute(hg);
		int statuscode=cr.getStatusLine().getStatusCode();
		System.out.println("status code is"+statuscode);
		String response=EntityUtils.toString(cr.getEntity(), "UTF-8");
		System.out.println(response);
		JSONObject jb=new JSONObject(response);
		System.out.println("Json format"+jb);
		
			
	}
	
	@Then("^perform the POST request \"([^\"]*)\" and \"([^\"]*)\"$")
	public void execution_in_progress(String url, String api) throws Throwable,JsonGenerationException, JsonMappingException, IOException, JsonException {
		
		System.out.println("Starting POST request");
		String posturl=url+api;
		ObjectMapper om=new ObjectMapper();
		ApiBody ab=new ApiBody("morpheus","leader");
		om.writeValue(new File("C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\EquifaxProject\\src\\main\\java\\org\\data\\test\\test.json"), ab);
	    String JsonString=om.writeValueAsString(ab);
	    System.out.println("post response is"+JsonString);
	    CloseableHttpClient cl=HttpClients.createDefault();
		HttpPost hp=new HttpPost(posturl);
		hp.addHeader("content-type", "application/json");
		hp.setEntity(new StringEntity(JsonString));
		CloseableHttpResponse crp=cl.execute(hp);
		//System.out.println(crp.toString());
		int statuspost=crp.getStatusLine().getStatusCode();
		//System.out.println("status code is"+statuspost);
		String postresponse=EntityUtils.toString(crp.getEntity(), "UTF-8");
			
		JSONObject jpb=new JSONObject(postresponse);
		System.out.println("Json format"+jpb);
	   
			       
      
		
	}
	
	@And("^Execution completed$")
	public void executioncompleted() {
		
		System.out.println("execution completed");
	}
	
	

}

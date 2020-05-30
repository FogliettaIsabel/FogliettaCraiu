package it.twitter.NetflixIT.ProgettoEsameOOP.service;

import java.net.*;
import java.util.*;
import java.util.jar.JarException;

import org.apache.tomcat.util.json.JSONParser;
import org.json.*;

import it.twitter.NetflixIT.ProgettoEsameOOP.model.Tweet;


public class JSONobj {

	
	public static JSONObject JSONfile() throws JarException  {
		
				String data = "";
			
				try
				{
					URL url = new URL("https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/statuses/user_timeline.json?screen_name=NetflixIT&count=100");
					//Aprire una connessione tra client e server
					HttpURLConnection conn = (HttpURLConnection)url.openConnection();
					//Get request data
					conn.setRequestMethod("GET");
					conn.connect();
					//Stato richiesta dell'API
					 int status = conn.getResponseCode();
				     System.out.println(status);
					
					//Scanner functionality will read the JSON data from the stream
					Scanner s = new Scanner(url.openStream());
					 try { 
						while(s.hasNext())
						{
							data+=s.nextLine(); 
							
						
						}
					

				      //Chiusura dello stream
						
					 }finally {
							s.close();
						}
					 
					 
	                 //JSONParser parse = new JSONParser(data); 
	                 JSONObject jobj = new JSONObject(data);
	                 
	                
	               //Store the JSON object in JSON array 
	     			JSONArray jsonarray = (JSONArray) jobj.get("Timeline");
	     			//Timeline timeline = new Timeline();
	     			
	     			//Get risultati
	     			for(int i=0;i<data.length();i++)
	     			{   
	     				
	     				
						
	     				JSONObject tweet = jsonarray.optJSONObject(i);
	     				Tweet t1= new Tweet();
	     				t1.setCreated_at(tweet.optString("created_at"));
	     				t1.setUser(tweet.opt("user"));
	     				t1.setId(tweet.optInt("id"));
	     				t1.setImgtxt(tweet.opt("testo immagine"));
	     				
	     			}
	     			
	     				
	     				
	     			
	     			conn.disconnect(); 
	     			
	     			
	     		}
	     		catch(Exception e)
	     		{
	     			e.printStackTrace();
	     		}
				return jobj;
				
	     	} 
	     }


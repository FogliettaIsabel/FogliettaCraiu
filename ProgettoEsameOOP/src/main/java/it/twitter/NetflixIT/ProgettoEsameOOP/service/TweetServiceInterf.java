package it.twitter.NetflixIT.ProgettoEsameOOP.service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import it.twitter.NetflixIT.ProgettoEsameOOP.model.*;



public class TweetServiceInterf implements TweetService {
	
	
	private Map<String, ArrayList<Tweet>> timeline=new HashMap<>();
	
	@Override
	public Collection<ArrayList<Tweet>> getTweet() {

		return timeline.values();

	}
	   //crea tweet
		public void create(Tweet tweet) {
	       
	        System.out.println("Creazione tweet: " + tweet.toString());
	        
	    }

		//aggiorna tweet
	    public void update(int id, Tweet tweet) {
	        
	        System.out.println("Aggiornamento tweet: " + tweet.toString());
	        
	    }
	    
	    //cancella tweet
	    public void delete(int id) {
	        
	        System.out.println("Eliminazione tweet:" + id);
	        
	    }
		
	}



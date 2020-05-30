package it.twitter.NetflixIT.ProgettoEsameOOP.service;

import java.util.ArrayList;
import java.util.Collection;

import it.twitter.NetflixIT.ProgettoEsameOOP.model.*;

public interface TweetService {
	
	public abstract void create(Tweet tweet);
	public abstract void update(int id, Tweet tweet);
	public abstract void delete(int id);
	public abstract Collection<ArrayList<Tweet>> getTweet();
}

package it.twitter.NetflixIT.ProgettoEsameOOP.model;

import com.fasterxml.jackson.annotation.*;


public class tweet {
	
	/**
	 * Parametri
	 * @param created_at
	 * @param id
	 * @param user
	 * @param txtimg
	 */
	 
	@JsonPropertyDescription("Data di pubblicazione del tweet")
	private String created_at;
	
	@JsonPropertyDescription("Id del tweet")
	private int id;
	
	@JsonPropertyDescription ("Nome dell'utente")
	private Object user;
	
	@JsonPropertyDescription ("Testo immagine")
	private Object imgtxt;
	
	
	/**
	 * Costruttore della classe 
	 * @param created_at
	 * @param id
	 * @param imgtxt
	 * @param user
	 */
	public tweet(String created_at, int id, Object user, Object imgtxt) {
		super();
		this.created_at = created_at;
		this.id = id;
		this.user = user;
		this.txtimg = imgtxt;
	}
	/**
	 * Costruttore della classe senza parametri
	 */
	public tweet() {
	}
	
	/**
	 * Getters
	 */
	public String getCreated_at() {
		return created_at;
	}

	public int getId() {
		return id;
	}

	public Object getUser() {
		return user;
	}
	public Object getimgtxt() {
		return imgtxt;
	}
	
	/**
	 * Setters
	 */
	
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUser(Object user) {
		this.user = user;
	}
	public void setImgtxt(Object imgtxt) {
		this.imgtxt = imgtxt;
	}
	
	
  
	/**
	 * Stampa
	 */
	public void infoTWEET(){
		System.out.println(this.getCreated_at());
		System.out.println(this.getId());
		System.out.println(this.getimgtxt());
		
	}
	
	



}

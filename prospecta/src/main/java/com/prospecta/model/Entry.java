package com.prospecta.model;

import org.springframework.data.web.JsonPath;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entry {

	@JsonProperty("API")
	private String api;
	@JsonProperty("Description")
	private String description;
	@JsonProperty("Auth")
	private String auth;
	@JsonProperty("HTTPS")
	private boolean https;
	@JsonProperty("Cors")
	private String cors;
	@JsonProperty("Link")
	private String category;
	
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public boolean isHttps() {
		return https;
	}
	public void setHttps(boolean https) {
		this.https = https;
	}
	public String getCors() {
		return cors;
	}
	public void setCors(String cors) {
		this.cors = cors;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
} 

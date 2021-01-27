package com.deckers.integrations.ecommdecouplingdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FulfillmentCenter{
    @JsonProperty("Id") 
    public String id;
    @JsonProperty("Name") 
    public String name;
    @JsonProperty("Type") 
    public String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public FulfillmentCenter(String id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
    
    
}
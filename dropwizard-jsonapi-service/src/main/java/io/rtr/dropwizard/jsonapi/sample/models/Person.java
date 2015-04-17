package io.rtr.dropwizard.jsonapi.sample.models;

import io.rtr.jsonapi.annotation.ResourceObject;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@ResourceObject(resource="io.rtr.dropwizard.jsonapi.sample.resources.PeopleResource")
public class Person {
	private String id;
	private String type = "people";
	private String name;
	private String company;
	
	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}
}
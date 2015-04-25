package io.rtr.dropwizard.jsonapi.sample.models;

import io.rtr.jsonapi.annotation.ApiModel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@ApiModel("articles")
@JsonInclude(Include.NON_NULL)
public class Article {
	private String id;
	private String type = "articles";
	private String title;
	private String body;
	
	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
package com.mourya.learning.JsonConverter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Workflow {

	@JsonProperty("workflowname")
	private String workflowname;
	@JsonProperty("author")
	private String author;
	@JsonProperty("actions")
	private List<GeniricAction> actions = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("workflowname")
	public String getWorkflowname() {
		return workflowname;
	}

	@JsonProperty("workflowname")
	public void setWorkflowname(String workflowname) {
		this.workflowname = workflowname;
	}

	@JsonProperty("author")
	public String getAuthor() {
		return author;
	}

	@JsonProperty("author")
	public void setAuthor(String author) {
		this.author = author;
	}

	@JsonProperty("actions")
	public List<GeniricAction> getActions() {
		return actions;
	}

	@JsonProperty("actions")
	public void setActions(List<GeniricAction> geniricAction) {
		this.actions = geniricAction;
	}

}

package com.mourya.learning.JsonConverter;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GeniricAction {

	@JsonProperty("actionName")
	String actionName;

	@JsonProperty("config")
	Map<String, Object> config = new HashMap<String, Object>();

	@JsonProperty("actionName")
	public String getActionName() {
		return actionName;
	}

	@JsonProperty("actionName")
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	@JsonAnyGetter
	public Map<String, Object> getConfig() {
		return this.config;
	}

	@JsonAnySetter
	public void setConfig(String name, Object value) {
		this.config.put(name, value);
	}
}

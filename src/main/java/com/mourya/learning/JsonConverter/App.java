package com.mourya.learning.JsonConverter;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException
    {
    	
    	String jsonString = "{\"workflowname\":\"John\",\"author\":\"Smith\",\"actions\":[{\"actionName\":\"name1\",\"config1\":\"asknd\"},{\"actionName\":\"name2\",\"config2\":\"askjd\"}]}";
    	
    	ObjectMapper mapper = new ObjectMapper();
    	Workflow obj = mapper.readValue(jsonString, Workflow.class);
    	
    	System.out.println(obj);

    }
}

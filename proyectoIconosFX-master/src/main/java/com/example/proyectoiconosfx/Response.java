package com.example.proyectoiconosfx;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("htmlCode")
	private List<String> htmlCode;

	@JsonProperty("name")
	private String name;

	@JsonProperty("unicode")
	private List<String> unicode;

	@JsonProperty("category")
	private String category;

	@JsonProperty("group")
	private String group;



	public String getName(){
		return name;
	}

	public List<String> getUnicode(){
		return unicode;
	}


}
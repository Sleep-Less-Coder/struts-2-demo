package com.hemant.struts2demo.service;

public class TutorialFinderService {
	
	public String getBestTutorialSites(String language) {
		if(language == null || language.equalsIgnoreCase("java")) {
			return "Java Brains";
		} else {
			return "Language not supported yet";
		}
	}
}

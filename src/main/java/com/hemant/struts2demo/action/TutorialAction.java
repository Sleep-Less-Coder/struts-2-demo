package com.hemant.struts2demo.action;

import com.hemant.struts2demo.service.TutorialFinderService;
import com.opensymphony.xwork2.Action;

public class TutorialAction implements Action{

	private String bestTutorialSite;
	private String language;

	public String execute() {
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		setBestTutorialSite(tutorialFinderService.getBestTutorialSites(getLanguage()));
		return "success";
	}

//	public String getTutorial() {
//		System.out.println("getTutorial method executed.");
//		return SUCCESS;
//	}
//
//	public String addTutorial() {
//		System.out.println("addTutorial method executed");
//		return SUCCESS;
//	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}

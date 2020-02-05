package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	//add new fields for email address and team
	private String emailAddress;
	private String team;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: Inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("Cricket Coach: Inside setter method - setTeam");
		this.team = team;
	}
	public CricketCoach() {
		System.out.println("Cricket Coach: Inside No arg constructor");
	}
	//Our Setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {	
		return "Practise fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

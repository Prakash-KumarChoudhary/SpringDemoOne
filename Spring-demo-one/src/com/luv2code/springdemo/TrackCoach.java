package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return ("just DO it :" + fortuneService.getFortune());
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : Inside method doMyStartupStuff");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach : Inside method doMyCleanupStuff");
	}
	
	
	
	
	
	
	

}

package com.ipl2018.sanjeev;

public abstract class Team {
	private String name;
	private String jerseyColor;
	private String city;
	private String homeGround;
	private String isLastYearChampion;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJerseyColor() {
		return jerseyColor;
	}

	public void setJerseyColor(String jerseyColor) {
		this.jerseyColor = jerseyColor;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHomeGround() {
		return homeGround;
	}

	public void setHomeGround(String homeGround) {
		this.homeGround = homeGround;
	}

	public String isLastYearChampion() {
		return isLastYearChampion;
	}

	public void setLastYearChampion(String isLastYearChampion) {
		this.isLastYearChampion = isLastYearChampion;
	}
	
	public abstract void  getTeamCheers();
	public abstract void  getCaptainName();
	public abstract void getBestForeignPlayers();
	public abstract void getBestLocalPlayers();
	public abstract void getHighestRunScoreer();
	public abstract void getHIghestWicketTakers();

}

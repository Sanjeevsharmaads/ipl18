package com.ipl2018.sanjeev;

public class TeamMumbai extends Team {

	private String captainName;
	private String[] foreignPlayers;
	private String[] localPlayers;
	private String runScoreer;
	private String highestWicketTacker;

	public TeamMumbai(String captainName, String[] foreignPlayers, String[] localPlayers, String runScoreer,
			String highestWicketTacker)

	{
		this.captainName = captainName;
		this.foreignPlayers = foreignPlayers;
		this.localPlayers = localPlayers;
		this.runScoreer = runScoreer;
		this.highestWicketTacker = highestWicketTacker;

	}

	public void getTeamCheers() {
		System.out.println("Guvera!");

	}

	public void getCaptainName() {

		System.out.println("Captain of Mumbai is " + captainName);

	}

	public void getBestForeignPlayers() {
		System.out.println("Best Foreign Players of Mumbai is :");
		for (int i = 0; i < foreignPlayers.length; i++) {
			System.out.println(" " + foreignPlayers[i] + " ");
		}

	}

	public void getBestLocalPlayers() {
		System.out.println("Best Local Players of Mumbai is :");
		for (int i = 0; i < localPlayers.length; i++) {
			System.out.println(" " + localPlayers[i] + " ");
		}

	}

	public void getHighestRunScoreer() {
		System.out.println("Highest Run Scorrer of Mumbai is :" + runScoreer);

	}

	public void getHIghestWicketTakers() {

		System.out.println("Highest Wicket Tacker of Mumbai is :" + highestWicketTacker);
	}

}

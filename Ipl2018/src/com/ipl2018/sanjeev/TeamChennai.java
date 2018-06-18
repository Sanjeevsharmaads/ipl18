package com.ipl2018.sanjeev;

public class TeamChennai extends Team {
	private String captainName;
	private String[] foreignPlayers;
	private String[] localPlayers;
	private String runScoreer;
	private String highestWicketTacker;

	public TeamChennai(String captainName, String[] foreignPlayers, String[] localPlayers, String runScoreer,
			String highestWicketTacker)

	{
		this.captainName = captainName;
		this.foreignPlayers = foreignPlayers;
		this.localPlayers = localPlayers;
		this.runScoreer = runScoreer;
		this.highestWicketTacker = highestWicketTacker;

	}

	public void getTeamCheers() {

		System.out.println("KingFisher!");
	}

	@Override
	public void getCaptainName() {

		System.out.println("Captain of Chennai is " + captainName);
	}

	@Override
	public void getBestForeignPlayers() {
		System.out.println("Best Foreign Players of Chennai is :");
		for (int i = 0; i < foreignPlayers.length; i++) {
			System.out.println(" " + foreignPlayers[i] + " ");
		}
	}

	@Override
	public void getBestLocalPlayers() {
		System.out.println("Best Local Players of Chennai is :");
		for (int i = 0; i < localPlayers.length; i++) {
			System.out.println(" " + localPlayers[i] + " ");
		}
	}

	@Override
	public void getHighestRunScoreer() {
		System.out.println("Highest Run Scorrer of CHennai is :" + runScoreer);
	}

	@Override
	public void getHIghestWicketTakers() {
		// TODO Auto-generated method stub
		System.out.println("Highest Wicket Tacker of CHennai is :" + highestWicketTacker);

	}

}

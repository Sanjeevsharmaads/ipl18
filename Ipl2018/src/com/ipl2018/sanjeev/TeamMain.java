package com.ipl2018.sanjeev;

public class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamChennai chennai = new TeamChennai("MS Dhoni", new String[] { "S watson", "Bravo", "Sam Billings" },
				new String[] { "Suresh Raina", "Ambati Raydu", "R Jadeja" }, "Ambati Raydu", "Shardul Thakur");
		TeamRcb rcb = new TeamRcb("Virat Kohli", new String[] { "AB de Villiers", " Quinton de Kock", " Tim Southee" },
				new String[] { "Virat Kohli", "Mandeep Singh", "Parthiv Patel" }, "Virat Kohli", "Umesh Yadav");
		TeamMumbai mumbai = new TeamMumbai("Rohit Sharma",
				new String[] { "Evin Lewis", "Kieron Pollard", "Ben Cutting" },
				new String[] { "Hardik Pandya", "Krunal Pandya", "Jasprit Bumrah" }, "Ewin Levis", "Hardik Pandya");
		TeamPunjab punjab = new TeamPunjab("R Ashwin",
				new String[] { "Andrew Tye", "Chris Gayle", " Aaron Finch" },
				new String[] { "Kl Rahul", "Karun Nair", "R Ashwin" }, "Kl Rahul", "Andrew Tye");
		chennai.setName("Chennai Super Kings");
		chennai.setCity("Chennai");
		chennai.setJerseyColor("Yellow");
		chennai.setHomeGround("pune");
		chennai.setLastYearChampion("yes");
		System.out.println("Name of Team is " + chennai.getName());
		System.out.println("City of Team is " + chennai.getCity());
		System.out.println("Jersey Color of Team is " + chennai.getJerseyColor());
		System.out.println("HomeGround of Team is " + chennai.getHomeGround());
		System.out.println("is team last year Champion ? " + chennai.isLastYearChampion());
		System.out.println("------------------------------------");
		chennai.getBestForeignPlayers();
		System.out.println("------------------------------------");
		chennai.getCaptainName();
		System.out.println("------------------------------------");
		chennai.getBestLocalPlayers();
		System.out.println("------------------------------------");
		chennai.getHighestRunScoreer();
		System.out.println("------------------------------------");
		chennai.getHIghestWicketTakers();
		System.out.println("------------------------------------");
		chennai.getCity();
		rcb.setName("Royal Challenger Bangalore");
		rcb.setCity("Banglore");
		rcb.setHomeGround("chinnaswamy");
		rcb.setJerseyColor("Red and Black");
		rcb.setLastYearChampion("no");
		System.out.println("Name of Team is " + rcb.getName());
		System.out.println("City of Team is " + rcb.getCity());
		System.out.println("Jersey Color of Team is " + rcb.getJerseyColor());
		System.out.println("HomeGround of Team is " + rcb.getHomeGround());
		System.out.println("is team last year Champion ? " + rcb.isLastYearChampion());
		System.out.println("------------------------------------");
		rcb.getBestForeignPlayers();
		System.out.println("------------------------------------");
		rcb.getCaptainName();
		System.out.println("------------------------------------");
		rcb.getBestLocalPlayers();
		System.out.println("------------------------------------");
		rcb.getHighestRunScoreer();
		System.out.println("------------------------------------");
		rcb.getHIghestWicketTakers();
		System.out.println("------------------------------------");
		rcb.getCity();
		mumbai.setName("Mumbai Indian");
		mumbai.setCity("Mumbai");
		mumbai.setHomeGround("Wankhade");
		mumbai.setJerseyColor("Blue");
		mumbai.setLastYearChampion("no");
		System.out.println("Name of Team is " + mumbai.getName());
		System.out.println("City of Team is " + mumbai.getCity());
		System.out.println("Jersey Color of Team is " + mumbai.getJerseyColor());
		System.out.println("HomeGround of Team is " + mumbai.getHomeGround());
		System.out.println("is team last year Champion ? " + mumbai.isLastYearChampion());
		System.out.println("------------------------------------");
		mumbai.getBestForeignPlayers();
		System.out.println("------------------------------------");
		mumbai.getCaptainName();
		System.out.println("------------------------------------");
		mumbai.getBestLocalPlayers();
		System.out.println("------------------------------------");
		mumbai.getHighestRunScoreer();
		System.out.println("------------------------------------");
		mumbai.getHIghestWicketTakers();
		System.out.println("------------------------------------");
		mumbai.getCity();
		punjab.setName("Kings XI Punjab");
		punjab.setCity("Mohali");
		punjab.setHomeGround("Bindra Stadium Mohali");
		punjab.setJerseyColor("Red");
		punjab.setLastYearChampion("no");
		System.out.println("Name of Team is " + punjab.getName());
		System.out.println("City of Team is " + punjab.getCity());
		System.out.println("Jersey Color of Team is " +punjab.getJerseyColor());
		System.out.println("HomeGround of Team is " + punjab.getHomeGround());
		System.out.println("is team last year Champion ? " + punjab.isLastYearChampion());
		System.out.println("------------------------------------");
		punjab.getBestForeignPlayers();
		System.out.println("------------------------------------");
		punjab.getCaptainName();
		System.out.println("------------------------------------");
		punjab.getBestLocalPlayers();
		System.out.println("------------------------------------");
		punjab.getHighestRunScoreer();
		System.out.println("------------------------------------");
		punjab.getHIghestWicketTakers();
		System.out.println("------------------------------------");
		punjab.getCity();


	}

}

package com.fatih.leagueHW;

import java.util.ArrayList;



public class Test2 {
	
	public static void main(String[] args) {
		League league1=new League(601,"Süperlig");
		league1.setTeamList(new ArrayList<>());
		
		Team teamA=new Team(801,"Godoro Spor");
		teamA.setPlayerList(new ArrayList<>());
		
		Player player1=new Player(401,"Teoman Alpay",4.67);
		player1.setTeam(teamA);
		teamA.getPlayerList().add(player1);
		
		Player player2=new Player(402,"Yusuf Nalkesen",7.89);
		player2.setTeam(teamA);
		teamA.getPlayerList().add(player2);
		
		Player player3=new Player(403,"Avni Anıl",6.61);
		player3.setTeam(teamA);
		teamA.getPlayerList().add(player3);
		
		
		league1.getTeamList().add(teamA);
		
		System.out.println(league1.getLeagueId()+" "+league1.getLeagueName());
		System.out.println("\t"+teamA.getTeamId()+" "+teamA.getTeamName());
		for (Player player : teamA.getPlayerList()) {
			
			System.out.println("\t"+"\t"+player.getPlayerId()+" "
					+player.getPlayerName()+" "
					+player.getAverageScore());
			
		}
		
		

		
		
		
		
		
	}

}

package com.cursoapidev.domain;

import java.util.Set;

public class Team {

	String name;
	String location;
	String mascote;
	Set<Player> players;
	

	public Team(String name, String location, String mascote, Set<Player> players) {
		super();
		this.name = name;
		this.location = location;
		this.mascote = mascote;
		this.players = players;
	}
	
	public Team() {

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascote() {
		return mascote;
	}
	public void setMascote(String mascote) {
		this.mascote = mascote;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	
	
	
	
	
	
}

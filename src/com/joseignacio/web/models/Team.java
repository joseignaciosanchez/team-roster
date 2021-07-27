package com.joseignacio.web.models;

import java.util.ArrayList;

public class Team {

	private int id;
	private String name;
	public static int numEquipos = 0;
	
	ArrayList<Player> players;

	public Team(String name) {
		super();
		this.name = name;
		this.players = new ArrayList<Player>();
		this.id = numEquipos;
		numEquipos++;
	}
	
	public Team() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String showTeams() {
		return this.name;
	}
}
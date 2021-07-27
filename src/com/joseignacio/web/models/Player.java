package com.joseignacio.web.models;

public class Player {

	private int id;
	private String first_name;
	private String last_name;
	private int age;
	public static int numJugadores = 0;
	
	public Player(String namePlayer, String lastPlayer, int age) {
		super();
		this.first_name = namePlayer;
		this.last_name = lastPlayer;
		this.age = age;
		this.id = numJugadores;
		numJugadores++;
	}
	
	public Player() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getNumJugadores() {
		return numJugadores;
	}

	public static void setNumJugadores(int numJugadores) {
		Player.numJugadores = numJugadores;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

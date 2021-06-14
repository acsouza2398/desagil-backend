package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track (Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}
	
	public Artist getArtist() {
		return this.artist;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public String getDurationString() {
		int minutos;
		int segundos;
		
		if(this.duration < 10) {
			return "0:0" + this.duration;
		} else if(this.duration < 60) {
			return "0:" + this.duration;
		} else {
			minutos = Math.round(this.duration/60);
			segundos = this.duration-60*minutos;
			if(segundos < 10) {
				return minutos + ":0" + segundos;
			} else {
				return minutos + ":" + segundos;
			}
			
		}
	}
	
	public String getFullArtistName() {
		return getFullArtistName();
	}

}

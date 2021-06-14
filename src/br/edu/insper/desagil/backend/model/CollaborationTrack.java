package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track{
	private List<String> collaborators;
	
	public CollaborationTrack(Artist artist, String name, int duration, List<String> collaborators) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}
	
	public String getFullArtistName() {
		String collaboratorsFullName;
		
		collaboratorsFullName = String.join(", ", collaborators);
		return this.getArtist().getName() + " (feat. " + collaboratorsFullName + ")";
	}	

}

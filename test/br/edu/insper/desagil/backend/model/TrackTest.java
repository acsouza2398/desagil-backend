package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	@BeforeEach
	void setUp() {
	}

	@Test
	void testZeroSeconds() {		
		Artist a = new Artist("Anitta");
		Track t = new Track (a, "Yes", 0);
		
		assertEquals("0:00", t.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		Artist a = new Artist("Anitta");
		Track t = new Track (a, "Yes", 5);
		
		assertEquals("0:05", t.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		Artist a = new Artist("Anitta");
		Track t = new Track (a, "Yes", 25);
		
		assertEquals("0:25", t.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		Artist a = new Artist("Anitta");
		Track t = new Track (a, "Yes", 60);
		
		assertEquals("1:00", t.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		Artist a = new Artist("Anitta");
		Track t = new Track (a, "Yes", 65);
		
		assertEquals("1:05", t.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		Artist a = new Artist("Anitta");
		Track t = new Track (a, "Yes", 85);
		
		assertEquals("1:25", t.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		Artist a = new Artist("Anitta");
		Track t = new Track (a, "Yes", 120);
		
		assertEquals("2:00", t.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		Artist a = new Artist("Anitta");
		Track t = new Track (a, "Yes", 125);
		
		assertEquals("2:05", t.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		Artist a = new Artist("Anitta");
		Track t = new Track (a, "Yes", 145);
		
		assertEquals("2:25", t.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		Artist a = new Artist("Anitta");
		List<String> c = new ArrayList<>();
		c.add("Becky G");
		CollaborationTrack t = new CollaborationTrack (a, "Yes", 145, c);
		
		assertEquals("Anitta (feat. Becky G)", t.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		Artist a = new Artist("Anitta");
		List<String> c = new ArrayList<>();
		c.add("Ludmilla");
		c.add("Snoop Dog");
		CollaborationTrack t = new CollaborationTrack (a, "Yes", 145, c);
		
		assertEquals("Anitta (feat. Ludmilla, Snoop Dog)", t.getFullArtistName());
	}
}

package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;
	private Playlist p;

	@BeforeEach
	void setUp() {
		p = new Playlist(1);
	}

	@Test
	void testRoundDownToZero() {
		p.putRating("a", 1);
		p.putRating("b", 2);
		p.putRating("c", 3);
		p.putRating("d", 3);
		
		assertEquals(2, p.averageRatings());
	}

	@Test
	void testRoundUpToHalf() {
		p.putRating("a", 1);
		p.putRating("b", 2);
		p.putRating("c", 1);
		
		assertEquals(1.5, p.averageRatings());
	}

	@Test
	void testRoundDownToHalf() {
		p.putRating("a", 1);
		p.putRating("b", 2);
		p.putRating("c", 2);
		
		assertEquals(1.5, p.averageRatings());
	}

	@Test
	void testRoundUpToOne() {
		p.putRating("a", 1);
		p.putRating("b", 2);
		p.putRating("c", 3);
		p.putRating("d", 1);
		
		assertEquals(2, p.averageRatings());
	}
}

package tests.InteractingMechanics;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.Card;
import cardsMechanics.Healer;
import cardsMechanics.Hunter;
import cardsMechanics.Knight;
import cardsMechanics.Shaman;

public class BorderCasesTest {

	Card hunter;
	Card healer;
	Card shaman;
	Card knight;
	
	@Before
	public void setUp() {
		hunter= new Hunter("cazador");
		knight= new Knight("caballero");
		healer= new Healer("sanador");
		shaman= new Shaman("shaman");
	}
	
	@Test
	public void testNoAutoDamge() {
		hunter.actOn(hunter);
		assertEquals(0,hunter.getDamageCounter());
	}
	
	@Test
	public void testNoNegativeDamageCounter() {
		healer.actOn(knight);
		assertEquals(0,knight.getDamageCounter());
	}
	
	@Test
	public void testNoNegativeAttackPoints() {
		shaman.actOn(knight);
		assertEquals(8,knight.getAttackPoints());
		shaman.actOn(knight);
		assertEquals(4,knight.getAttackPoints());
		shaman.actOn(knight);
		assertEquals(0,knight.getAttackPoints());
		shaman.actOn(knight);
		shaman.actOn(knight);
		assertEquals(0,knight.getAttackPoints());
	}
	
	@Test
	public void testIsOutOfCombat() {
		hunter.actOn(knight);
		hunter.actOn(knight);
		hunter.actOn(knight);
		hunter.actOn(knight);
		hunter.actOn(knight);
		hunter.actOn(knight);
		assertEquals(100,knight.getDamageCounter());
		assertTrue(knight.isOutOfCombat());
		knight.actOn(hunter);
		assertEquals(0,hunter.getDamageCounter());
	}
}

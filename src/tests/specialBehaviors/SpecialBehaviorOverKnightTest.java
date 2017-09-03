package tests.specialBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.*;

public class SpecialBehaviorOverKnightTest {
	Card assassin;	
	Card hunter;
	Card knight;
	
	@Before
	public void setUp() {
		assassin = new Assassin("asesino");
		hunter= new Hunter("cazador");
		knight= new Knight("caballero");
	}
	
	@Test
	public void testHalfDamageByAssassin() {
		assassin.actOn(knight);
		assertEquals(6,knight.getDamageCounter());
	}
	
	@Test
	public void testDobleDamageByHunter() {
		hunter.actOn(knight);
		assertEquals(24,knight.getDamageCounter());
	}
}
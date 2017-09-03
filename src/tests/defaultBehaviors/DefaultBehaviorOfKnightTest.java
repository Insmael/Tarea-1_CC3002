package tests.defaultBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.Card;
import cardsMechanics.Knight;
import cardsMechanics.Warlock;

public class DefaultBehaviorOfKnightTest {

	Card knight;
	Card warlock;
	
	@Before
	public void setUp() {
		knight= new Knight("caballero");
		warlock= new Warlock("señor de la guerra");
	}
	
	@Test
	public void testDefaultAsDamageFromKnight() {
		knight.actOn(warlock);
		assertEquals(12,warlock.getDamageCounter());
	}
}

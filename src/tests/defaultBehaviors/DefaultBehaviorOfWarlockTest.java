package tests.defaultBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.Card;
import cardsMechanics.Healer;
import cardsMechanics.Warlock;

public class DefaultBehaviorOfWarlockTest {
	Card healer;
	Card warlock;
	
	@Before
	public void setUp() {
		healer= new Healer("sanador");
		warlock= new Warlock("señor de la guerra");
		
	}
	
	@Test
	public void testDefaultAsDamageFromWarlock() {
		warlock.actOn(healer);
		assertEquals(12,healer.getDamageCounter());
	}

}

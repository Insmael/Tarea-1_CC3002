package tests.defaultBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.Assassin;
import cardsMechanics.Card;
import cardsMechanics.Hunter;

public class DefaultBehaviorOfAssassinTest {

	Card assassin;
	Card hunter;
	
	@Before
	public void setUp() {
		assassin = new Assassin("asesino");
		hunter= new Hunter("cazador");
	}
	
	@Test
	public void testDefaultAsDamageFromAssassin() {
		assassin.actOn(hunter);
		assertEquals(12,hunter.getDamageCounter());
	}
}

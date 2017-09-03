package tests.defaultBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.Card;
import cardsMechanics.Druid;
import cardsMechanics.Hunter;

public class DefaultBehaviorOfHunterTest {
	Card druid;
	Card hunter;
	
	@Before
	public void setUp() {
		druid= new Druid("druida");
		hunter= new Hunter("cazador");
	}
	
	@Test
	public void testDefaultAsDamageFromHunter() {
		hunter.actOn(druid);
		assertEquals(12,druid.getDamageCounter());
	}
}

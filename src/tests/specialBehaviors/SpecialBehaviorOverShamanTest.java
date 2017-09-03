package tests.specialBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.*;

public class SpecialBehaviorOverShamanTest {
	Card hunter;
	Card shaman;
	
	@Before
	public void setUp() {
		hunter= new Hunter("cazador");
		shaman= new Shaman("shaman");
	}
	
	@Test
	public void testDobleDamageByHunter() {
		hunter.actOn(shaman);
		assertEquals(24,shaman.getDamageCounter());
	}
}
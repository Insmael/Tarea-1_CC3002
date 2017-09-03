package tests.specialBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.*;

public class SpecialBehaviorOverWarlockTest {
	Card healer;
	Card shaman;
	Card warlock;
	
	@Before
	public void setUp() {
		healer= new Healer("sanador");
		shaman= new Shaman("shaman");
		warlock= new Warlock("señor de la guerra");
		
	}
	
	@Test
	public void testDamageInsteadOfHealingByHealer() {
		healer.actOn(warlock);
		assertEquals(12,warlock.getDamageCounter());
	}
	
	@Test
	public void testDobleEfectByShaman() {
		shaman.actOn(warlock);
		assertEquals(4,warlock.getAttackPoints());
		assertEquals(8,warlock.getDamageCounter());
	}
}
package tests.specialBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.*;

public class SpecialBehaviorOverHealerTest {
	Card assassin;	
	Card healer;
	Card hunter;
	Card paladin;
	
	@Before
	public void setUp() {
		assassin = new Assassin("asesino");
		healer= new Healer("sanador");
		hunter= new Hunter("cazador");
		paladin= new Paladin("paladin");
		
	}
	
	@Test
	public void testDobleDamageByAssassin() {
		assassin.actOn(healer);
		assertEquals(24,healer.getDamageCounter());
	}
	
	@Test
	public void testDobleEfectByPaladin() {
		hunter.actOn(healer);
		paladin.actOn(healer);
		assertEquals(4,healer.getDamageCounter());
		assertEquals(20,healer.getAttackPoints());
	}
}
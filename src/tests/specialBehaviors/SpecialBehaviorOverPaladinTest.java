package tests.specialBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.*;

public class SpecialBehaviorOverPaladinTest {
	Card knight;
	Card mage;
	Card paladin;
	
	@Before
	public void setUp() {
		knight= new Knight("caballero");
		mage= new Mage("mago");
		paladin= new Paladin("paladin");
		
	}
	
	@Test
	public void testHalfDamageByKnight() {
		knight.actOn(paladin);
		assertEquals(6,paladin.getDamageCounter());
	}
	
	@Test
	public void testDobleDamageByMage() {
		mage.actOn(paladin);
		assertEquals(24,paladin.getDamageCounter());
	}
}
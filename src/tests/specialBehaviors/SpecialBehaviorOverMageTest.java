package tests.specialBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.*;

public class SpecialBehaviorOverMageTest {
	Card assassin;
	Card mage;
	Card warlock;
	
	@Before
	public void setUp() {
		assassin = new Assassin("asesino");
		mage= new Mage("mago");
		warlock= new Warlock("señor de la guerra");
	}
	
	@Test
	public void testDobleDamageByAssassin() {
		assassin.actOn(mage);
		assertEquals(24,mage.getDamageCounter());
	}
	
	@Test
	public void testHalfDamageByWarlock() {
		warlock.actOn(mage);
		assertEquals(6,mage.getDamageCounter());
	}
}
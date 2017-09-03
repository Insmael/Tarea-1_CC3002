package tests.defaultBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.Card;
import cardsMechanics.Mage;
import cardsMechanics.Shaman;

public class DefaultBehaviorOfMageTest {
	Card mage;
	Card shaman;
	
	@Before
	public void setUp() {
		mage= new Mage("mago");
		shaman= new Shaman("shaman");
	}
	
	@Test
	public void testDefaultAsDamageFromMage() {
		mage.actOn(shaman);
		assertEquals(12,shaman.getDamageCounter());
	}
}

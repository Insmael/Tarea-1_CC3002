package tests.defaultBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.Card;
import cardsMechanics.Hunter;
import cardsMechanics.Mage;
import cardsMechanics.Paladin;

public class DefaultBehaviorOfPaladinTest {
	Card hunter;
	Card mage;
	Card paladin;
	
	@Before
	public void setUp() {
		hunter= new Hunter("cazador");
		mage= new Mage("mago");
		paladin= new Paladin("paladin");
	}
	
	@Test
	public void testDefaultAsHealAndEmpowerByAThirdFromHealer() {
		hunter.actOn(mage);
		paladin.actOn(mage);
		assertEquals(8,mage.getDamageCounter());
		assertEquals(16,mage.getAttackPoints());
	}

}
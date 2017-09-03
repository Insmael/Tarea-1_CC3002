package tests.defaultBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.Assassin;
import cardsMechanics.Card;
import cardsMechanics.Healer;
import cardsMechanics.Paladin;

public class DefaultBehaviorOfHealerTest {
	Card assassin;
	Card healer;
	Card paladin;
	
	@Before
	public void setUp() {
		assassin = new Assassin("asesino");
		healer= new Healer("sanador");
		paladin= new Paladin("paladin");		
	}
	
	@Test
	public void testDefaultAsHealByAHalfFromHealer() {
		assassin.actOn(paladin);
		healer.actOn(paladin);
		assertEquals(6,paladin.getDamageCounter());
	}

}


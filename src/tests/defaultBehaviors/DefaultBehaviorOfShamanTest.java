package tests.defaultBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.Assassin;
import cardsMechanics.Card;
import cardsMechanics.Shaman;

public class DefaultBehaviorOfShamanTest {

	Card assassin;
	Card shaman;
	
	@Before
	public void setUp() {
		assassin = new Assassin("asesino");
		shaman= new Shaman("shaman");
	}
	
	@Test
	public void testDefaultAsDamageAnDepoweByAThirdFromShaman() {
		shaman.actOn(assassin);
		assertEquals(4,assassin.getDamageCounter());
		assertEquals(8,assassin.getAttackPoints());
	}

}

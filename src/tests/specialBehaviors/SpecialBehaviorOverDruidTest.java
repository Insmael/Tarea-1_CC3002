package tests.specialBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.*;

public class SpecialBehaviorOverDruidTest {
	Card assassin;	
	Card druid;
	Card paladin;
	Card shaman;
	
	@Before
	public void setUp() {
		assassin = new Assassin("asesino");
		druid= new Druid("druida");
		paladin= new Paladin("paladin");
		shaman= new Shaman("shaman");
	}
	
	@Test
	public void testDobleEfectByShaman() {
		shaman.actOn(druid);
		assertEquals(8,druid.getDamageCounter());
		assertEquals(4,druid.getAttackPoints());
	}
	
	@Test
	public void testDobleEfectByPaladin() {
		assassin.actOn(druid);
		paladin.actOn(druid);
		assertEquals(4,druid.getDamageCounter());
		assertEquals(20,druid.getAttackPoints());
	}
}
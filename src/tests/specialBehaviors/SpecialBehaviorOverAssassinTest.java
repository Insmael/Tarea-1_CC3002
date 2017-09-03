package tests.specialBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.*;

public class SpecialBehaviorOverAssassinTest {
	Card assassin;	
	Card druid;
	Card warlock;
	
	@Before
	public void setUp() {
		assassin = new Assassin("asesino");
		druid= new Druid("druida");
		warlock= new Warlock("señor de la guerra");
		
	}
	
	@Test
	public void testDobleDamageByWarlock() {
		warlock.actOn(assassin);
		assertEquals(24,assassin.getDamageCounter());
	}
	
	@Test
	public void testEmpoweredWithNoDamageByDruid() {
		druid.actOn(assassin);
		assertEquals(0,assassin.getDamageCounter());
		assertEquals(24,assassin.getAttackPoints());
	}
}
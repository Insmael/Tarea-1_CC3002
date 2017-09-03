package tests.specialBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.*;

public class SpecialBehaviorOverHunterTest {
	Card druid;
	Card hunter;
	Card mage;
	
	@Before
	public void setUp() {
		druid= new Druid("druida");
		hunter= new Hunter("cazador");
		mage= new Mage("mago");		
	}
	
	@Test
	public void testOnlyDamageByDruid() {
		druid.actOn(hunter);
		assertEquals(6,hunter.getDamageCounter());
		assertEquals(12,hunter.getAttackPoints());
	}
	
	@Test
	public void testDobleDamageByMage() {
		mage.actOn(hunter);
		assertEquals(24,hunter.getDamageCounter());
	}
}
package tests.InteractingMechanics;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.Card;
import cardsMechanics.Healer;
import cardsMechanics.Hunter;
import cardsMechanics.Knight;
import cardsMechanics.Shaman;

public class SettingAndReadingCardTest {
	Card hunter;
	Card healer;
	Card shaman;
	Card knight;
	
	@Before
	public void setUp() {
		hunter= new Hunter("cazador");
		knight= new Knight("caballero");
		healer= new Healer("sanador");
		shaman= new Shaman("shaman");
	}
	
	@Test
	public void testSucsessfullNaming() {
		assertEquals("cazador",hunter.getName());
	}
	
	@Test
	public void testSuccsessfullTypeNamimng() {
		assertEquals("Hunter",hunter.getType());
	}
	
	@Test
	public void testSettingDefault() {
		assertEquals(100,hunter.getLifePoints());
		assertEquals(0,hunter.getDamageCounter());
		assertEquals(12,hunter.getAttackPoints());
	}
	
	@Test
	public void testChangingValuesOfCard() {
		hunter.setCard(200,20,50);
		assertEquals(200,hunter.getLifePoints());
		assertEquals(50,hunter.getDamageCounter());
		assertEquals(20,hunter.getAttackPoints());
	}
}

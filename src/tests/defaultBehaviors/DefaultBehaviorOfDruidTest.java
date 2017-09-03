package tests.defaultBehaviors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cardsMechanics.Card;
import cardsMechanics.Druid;
import cardsMechanics.Knight;

public class DefaultBehaviorOfDruidTest {
	
	Card druid;
	Card knight;
	
	@Before
	public void setUp() {
		druid= new Druid("druida");
		knight= new Knight("caballero");
	}
	
	@Test
	public void testDefaultAsDamageByAHalfAndEmpowerFromDruid() {
		druid.actOn(knight);
		assertEquals(6,knight.getDamageCounter());
		assertEquals(24,knight.getAttackPoints());
	}
}

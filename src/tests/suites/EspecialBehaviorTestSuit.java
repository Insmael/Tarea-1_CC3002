package tests.suites;

import org.junit.runners.Suite;

import tests.specialBehaviors.*;

import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	SpecialBehaviorOverAssassinTest.class,
	SpecialBehaviorOverDruidTest.class,
	SpecialBehaviorOverHunterTest.class,
	SpecialBehaviorOverKnightTest.class,
	SpecialBehaviorOverMageTest.class,
	SpecialBehaviorOverHealerTest.class,
	SpecialBehaviorOverPaladinTest.class,
	SpecialBehaviorOverShamanTest.class,
	SpecialBehaviorOverWarlockTest.class,})

public class EspecialBehaviorTestSuit {
}

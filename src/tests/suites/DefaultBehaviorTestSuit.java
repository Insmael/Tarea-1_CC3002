package tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.defaultBehaviors.*;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	DefaultBehaviorOfAssassinTest.class,
	DefaultBehaviorOfDruidTest.class,
	DefaultBehaviorOfHunterTest.class,
	DefaultBehaviorOfKnightTest.class,
	DefaultBehaviorOfMageTest.class,
	DefaultBehaviorOfHealerTest.class,
	DefaultBehaviorOfPaladinTest.class,
	DefaultBehaviorOfShamanTest.class,
	DefaultBehaviorOfWarlockTest.class,})

public class DefaultBehaviorTestSuit {
}

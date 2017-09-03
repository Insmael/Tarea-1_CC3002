package tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	DefaultBehaviorTestSuit.class,
	EspecialBehaviorTestSuit.class,
	InteractingMechanicsTestSuit.class
})
public class SuitOfAllTestSuites {
}

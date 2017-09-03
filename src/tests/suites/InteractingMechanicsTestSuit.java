package tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.InteractingMechanics.BorderCasesTest;
import tests.InteractingMechanics.SettingAndReadingCardTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	SettingAndReadingCardTest.class,
	BorderCasesTest.class
})
public class InteractingMechanicsTestSuit {
}

package demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ RoundTripDemo.class, XSDValidationDemo.class, JSONValidationDemo.class })
public class FullDemo {

}

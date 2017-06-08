package HAS;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ACTest.class, Audio_SystemTest.class, LightTestOnOFF.class, TVTest.class, WashingMechineTest.class })
public class AllTests {

}

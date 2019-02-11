
/**
 * @author rohit.patil
 *
 */
package utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforeScenario() {
		System.out.println("This step will be executed before Scenario execution");
	}
	
	@After
	public void afterScenario() {
		System.out.println("This step will be executed after scenario execution");
	}
}

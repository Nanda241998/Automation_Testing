package greenCarttestng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dyanamicCode.Base_class;
import greenCarttest_case.NormalClassListener;
import greenCarttest_case.Page1GreenCart;
import greenCarttest_case.Page2GreenCart;
import greenCarttest_case.Page3GreenCart;

@Listeners(NormalClassListener.class)
public class TestNGexecutionClass extends Base_class {

	@Test(priority = 1, description = "test is defined to verify that all webelements should be clickable")
	public void verifyPage1() throws Throwable {
		Page1GreenCart p1 = new Page1GreenCart(driver);
		p1.actionsPerformed();
	}

	@Test(priority = 2, description = "test is defined to verify that search functionality working")
	public void verifyPage2() throws Throwable {
		Page2GreenCart p2 = new Page2GreenCart(driver);
		p2.actionsPerformedSearch();
		p2.actionsPerformedTopDeals();

	}

	@Test(priority = 3, description = "test is defined to verify that flights booking functionality working")
	public void verifyPage4() throws Throwable {

		Page3GreenCart p3 = new Page3GreenCart(driver);
		p3.actionsPerformedFlightBooking();

	}

}

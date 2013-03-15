package pl.arturkb.EInvoice.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pl.arturkb.EInvoice.Test.Filter.InternationalizationFilterSecureTest;
import pl.arturkb.EInvoice.Test.Filter.InternationalizationFilterTest;
import pl.arturkb.EInvoice.Test.Utils.ServletsUtilsTest;

@RunWith(Suite.class)
@SuiteClasses({ InternationalizationFilterSecureTest.class,
		InternationalizationFilterTest.class, ServletsUtilsTest.class })
public class AllTests {

}

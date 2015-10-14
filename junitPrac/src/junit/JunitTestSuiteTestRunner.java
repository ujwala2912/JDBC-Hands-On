package junit;

import static org.junit.Assert.*;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class JunitTestSuiteTestRunner {

	public static void main(String[] args) {

		org.junit.runner.Result result = JUnitCore.runClasses(JunitTestSuite.class);

		for (Failure fail : result.getFailures()) {

			System.out.println(fail.toString());
		}

		if (result.wasSuccessful()) {
			System.out.println("All tests finished successfully...");
		}
	}
}

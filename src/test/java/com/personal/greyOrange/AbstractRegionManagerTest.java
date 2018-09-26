package com.personal.greyOrange;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class AbstractRegionManagerTest {

	private AbstractRegionManager testClass;
	private Ball ball;
	private boolean executeCalled;
	@BeforeMethod
	public void setup() {
		executeCalled = false;
		ball = new Ball(1);
		testClass = new AbstractRegionManager(Executors.newFixedThreadPool(1)) {

			@Override
			public void execute(Ball ball) throws Exception {
				executeCalled = true;
			}
		};
	}

	public void testRegionEntered() throws Exception {
		testClass.enterRegion(ball);
		TimeUnit.SECONDS.sleep(1);
		Assert.assertTrue(executeCalled);
	}

}

package com.personal.greyOrange;

import java.util.concurrent.TimeUnit;

public class RegionS1Manager extends AbstractRegionManager implements RegionManager {
	protected RegionManager nextRegionManagement;

	public RegionS1Manager(RegionManager nextRegionManagement) {
		super();
		this.nextRegionManagement = nextRegionManagement;
	}

	@Override
	public void execute(Ball ball) throws Exception {
			System.out.println("Ball entered region 1: " + ball.getId());
			// Taking 1 second to exit region
			TimeUnit.SECONDS.sleep(1);
			nextRegionManagement.enterRegion(ball);
	}


}

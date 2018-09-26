package com.personal.greyOrange;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RegionS2Manager extends AbstractRegionManager implements RegionManager {

	private RegionManager nextRegionManagement;

	public RegionS2Manager(RegionManager nextRegionManagement) {
		this.nextRegionManagement = nextRegionManagement;
	}

	@Override
	public void execute(Ball ball) throws Exception {
			System.out.println("Ball entered region 2: " + ball.getId());
			// Taking 1-1.5 second to exit region
		TimeUnit.MILLISECONDS.sleep((new Long(new Random().nextInt(3) + 1) * 500));

		int randomColor = new Random().nextInt(4) + 1;
			ball.assignColor(Color.valueOfInteger(randomColor));
			nextRegionManagement.enterRegion(ball);

	}

}

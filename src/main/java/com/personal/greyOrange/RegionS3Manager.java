package com.personal.greyOrange;

import java.util.concurrent.TimeUnit;

public class RegionS3Manager extends AbstractRegionManager implements RegionManager {

	@Override
	public void execute(Ball ball) throws Exception {
			System.out.println("Ball entered region 3: " + ball.getId());
			// Taking 1 second to exit region
			TimeUnit.SECONDS.sleep(1);

			System.out.println("Destination found: " + ball);
	}

}

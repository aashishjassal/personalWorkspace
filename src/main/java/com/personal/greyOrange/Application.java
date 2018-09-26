package com.personal.greyOrange;

public class Application {

	public static void main(String[] args) {
		System.out.println("Start destination marking...");
		RegionManager regionS3Management = new RegionS3Manager();
		RegionManager regionS2Management = new RegionS2Manager(regionS3Management);
		RegionManager regionS1Management = new RegionS1Manager(regionS2Management);


		for (int i = 1; i <= 100; i++) {
            Ball b = new Ball(i);
			regionS1Management.enterRegion(b);
		}
	}

}

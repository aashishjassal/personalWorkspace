package com.personal.greyOrange;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class AbstractRegionManager implements RegionManager {

	private ExecutorService regionExecutors;

	public AbstractRegionManager() {
		this(Executors.newFixedThreadPool(5));
	}

	public AbstractRegionManager(ExecutorService regionExecutors) {
		this.regionExecutors = regionExecutors;
	}
	@Override
	public void enterRegion(Ball ball) {
		regionExecutors.submit(new Callable<Void>() {

			@Override
			public Void call() throws Exception {
				try {
					execute(ball);
				} catch (Exception e) {
					System.err.println("Error managing ball in this region");
				}
				return null;

			}
		});
	}

	public abstract void execute(Ball ball) throws Exception;

}
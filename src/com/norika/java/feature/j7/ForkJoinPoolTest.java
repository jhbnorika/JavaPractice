package com.norika.java.feature.j7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ThreadLocalRandom;

public class ForkJoinPoolTest {

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		forkJoinPool.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println(ThreadLocalRandom.current().nextInt(1000));
			}
		});
		forkJoinPool.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println(ThreadLocalRandom.current().nextInt(1000));
			}
		});
		forkJoinPool.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println(ThreadLocalRandom.current().nextInt(1000));
			}
		});
		forkJoinPool.invoke(new ForkJoinTask<String>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public String getRawResult() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			protected void setRawResult(String value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			protected boolean exec() {
				// TODO Auto-generated method stub
				return false;
			}
		});
		forkJoinPool.shutdown();
	}

}

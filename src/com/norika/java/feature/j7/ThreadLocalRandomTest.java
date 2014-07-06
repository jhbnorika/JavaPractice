package com.norika.java.feature.j7;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 验证码验证使用
 * 
 * @author Norika
 */
public class ThreadLocalRandomTest {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++)
			buildRandom();
	}

	private static void buildRandom() {
		new Thread() {
			@Override
			public void run() {
				super.run();
				System.out.println(ThreadLocalRandom.current().nextInt());
			}
		}.start();
	}

}

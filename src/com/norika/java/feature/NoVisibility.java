package com.norika.java.feature;

public class NoVisibility {
	private static boolean ready = false;
	private static int number = 0;

	private static class ReaderThread extends Thread {
		public void run() {
			while (!ready)
				Thread.yield();
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		new ReaderThread().start();
		ready = true;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		number = 42;
	}
}
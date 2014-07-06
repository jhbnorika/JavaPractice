package com.norika.java.feature;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	private AtomicInteger value = new AtomicInteger();

	public int increment() {
		return value.incrementAndGet();
	}

}

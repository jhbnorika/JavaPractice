package com.norika.java.feature;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ListTest {

	public static void main(String[] args) {
		String[] strs = { "a", "b", "c", "d" };

		Queue<String> queue = new ConcurrentLinkedDeque<String>();
		for (int i = 0; i < strs.length; i++)
			queue.add(strs[i]);

		for (String s : queue)
			queue.remove(s);

		System.out.println(queue.size());
	}

}

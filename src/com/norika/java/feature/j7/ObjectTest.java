package com.norika.java.feature.j7;

import java.util.Objects;

public class ObjectTest {

	public static void main(String[] args) {
		Object obj = null;

		// 输出一个null对象的hashCode值，输出0
		System.out.println(Objects.hashCode(obj));

		// 输出一个null对象的toString，输出null
		System.out.println(Objects.toString(obj));

		// 要求obj不能为null，如果为null则引发异常
		System.out.println(Objects.requireNonNull(obj));
	}

}

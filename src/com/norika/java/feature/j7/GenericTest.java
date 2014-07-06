package com.norika.java.feature.j7;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("A");

		list.addAll(new ArrayList<>()); //这样声明不合法？？貌似正确

		List<? extends String> list2 = new ArrayList<>(); //这样声明合法

		list.addAll(list2);
		
		System.out.println(list);
	}

}

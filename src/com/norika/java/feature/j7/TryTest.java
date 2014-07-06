package com.norika.java.feature.j7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class TryTest {
	
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		try (
		// 声明、初始化两个可关闭的资源
		BufferedReader br = new BufferedReader(new FileReader("TryTest.java"));
		PrintStream ps = new PrintStream(new FileOutputStream("readme.txt"))) {
			// 使用两个资源
			System.out.println(br.readLine());
			ps.println("test");
		}
		// 自动关闭资源的try语句相当于包含了隐式的finally块，用于关闭资源。
	}
	
}

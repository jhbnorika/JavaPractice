package com.norika.java.feature.j7;

public class MultiExceptionTest {

	public static void main(String[] args) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			math(a, b);

			int c = Integer.parseInt(args[2]);
			int d = Integer.parseInt(args[3]);
			math(c, d);
	}
	
	private static void math(int a,int b){
		try {
			int c = a / b;
			System.out.println("您输入的两个数相除的结果是：" + c);
		} catch (IndexOutOfBoundsException | NumberFormatException
				| ArithmeticException ie) {
			System.out.println("程序发生了数组越界、数字格式异常、算术异常之一");
			// 此处的 ie 默认有final修饰，所以不能改变，不能重新赋值。所以下面一行代码是错误的
			// ie = new ArithmeticException("test");
		} catch (Exception e) {
			System.out.println("未知异常。");
			// 捕获一种异常的时候，异常类型没有final修饰，所以下面的代码是合法的。
			e = new RuntimeException("test");
		}
	}

}

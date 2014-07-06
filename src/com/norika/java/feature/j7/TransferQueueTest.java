package com.norika.java.feature.j7;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class TransferQueueTest {
	public static void main(String[] args) {
		TransferQueue<String> transferQueue = new LinkedTransferQueue<>();
		product(transferQueue);
		consume(transferQueue);
	}
	
	private static void product(TransferQueue<String> transferQueue){
		new Thread(){
			@Override
			public void run() {
				super.run();
				try {
					System.out.println("生产等待1");
					Thread.sleep(3000);
					System.out.println("开始生产1");
					transferQueue.transfer("A");
					System.out.println("生产结束1");
					System.out.println("生产等待2");
					Thread.sleep(2000);
					System.out.println("开始生产2");
					transferQueue.tryTransfer("B");
					System.out.println("生产结束2");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
	
	private static void consume(TransferQueue<String> transferQueue){
		new Thread(){
			@Override
			public void run() {
				super.run();
				try {
					System.out.println("开始消费1");
					System.out.println(transferQueue.take());
					System.out.println("完成消费1");
					System.out.println("开始消费2");
					sleep(1000);
					System.out.println(transferQueue.take());
					System.out.println("完成消费2");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
}
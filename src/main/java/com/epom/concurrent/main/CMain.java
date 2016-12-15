package com.epom.concurrent.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author Vasyl Zarva.
 */
public class CMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("START");

		// threads
//
//		MyFirstThread thread = new MyFirstThread("My first thread");
//		thread.start();
//
//		MyFirstThread demonThread = new MyFirstThread("My first thread");
//		demonThread.setDaemon(true);
//		demonThread.start();

		// runnable / callable

//		MySecondThread secondThread1 = new MySecondThread();
//		MySecondThread secondThread2 = new MySecondThread();
//
//		final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
//		executorService.submit(secondThread1);
//		executorService.submit(secondThread2);
//
//		executorService.shutdown();
//		executorService.shutdown();
//		while (!executorService.isShutdown()) {
//			executorService.shutdown();
//			System.out.println("123");
//		}

		// modify variable



		System.out.println("END");
	}

	public static class MyThread extends Thread {

		public MyThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			try {
				long time = Thread.currentThread().isDaemon() ? 5000L : 2000L;
				System.out.println("I'm running for " + time + " milliseconds: start");
				Thread.sleep(time);
				System.out.println("I'm running for " + time + " milliseconds: end");
			} catch (InterruptedException e) {
				System.out.println("ex -> " + e.getMessage());
			}
		}
	}

	public static class MyFirstThread extends Thread {

		public MyFirstThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			try {
				long time = Thread.currentThread().isDaemon() ? 5000L : 2000L;
				System.out.println("I'm running for " + time + " milliseconds: start");
				Thread.sleep(time);
				System.out.println("I'm running for " + time + " milliseconds: end");
			} catch (InterruptedException e) {
				System.out.println("ex -> " + e.getMessage());
			}
		}
	}

	public static class MySecondThread implements Runnable {

		@Override
		public void run() {
			try {
				System.out.println("Do some work: start");
				Thread.sleep(10000L);
				System.out.println("Do some work: end");
			} catch (InterruptedException e) {
				System.out.println("ex -> " + e.getMessage());
			}
		}
	}

}

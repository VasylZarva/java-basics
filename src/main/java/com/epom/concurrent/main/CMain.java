package com.epom.concurrent.main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author Vasyl Zarva.
 */
public class CMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		System.out.println("START");

		// threads
//
//		MyFirstThread thread = new MyFirstThread("My first thread");
//		thread.start();
//
//		MyFirstThread demonThread = new MyFirstThread("My first thread");
//		demonThread.setDaemon(true);
//		demonThread.start();

		// runnable

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

//		Thread runnable = new Thread(new MySecondThread());
//		runnable.start();

		// callable

//		final ExecutorService executorService = Executors.newSingleThreadExecutor();
//		final Future<String> result = executorService.submit(new MyCallableThread());
//		executorService.shutdown();
////		String callableResult = result.get(5, TimeUnit.SECONDS);
//		String callableResult = result.get();
//		System.out.println("Callable result : " + callableResult);

		// modify variable

		final Counter sharedCounter = new Counter();
		Thread incThread1 = new Thread(new Incrementer(sharedCounter, 100000));
		Thread incThread2 = new Thread(new Incrementer(sharedCounter, 100000));
		incThread1.start();
		incThread2.start();
		incThread1.join();
		incThread2.join();

		System.out.println(sharedCounter.getCurrentCount());

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

	public static class MyCallableThread implements Callable<String> {

		@Override
		public String call() throws Exception {
			try {
				System.out.println("Do some callable work: start");
				Thread.sleep(4000L);
				System.out.println("Do some callable work: end");
			} catch (InterruptedException e) {
				System.out.println("ex -> " + e.getMessage());
			}

			return "Work is done : " + System.currentTimeMillis();
		}
	}


	public static class Incrementer implements Runnable {

		private final int times;
		private final Counter counter;

		public Incrementer(final Counter counter, final int times) {
			this.counter = counter;
			this.times = times;
		}

		@Override
		public void run() {
			int index = times;
			while (index-- > 0) {
				counter.increment();
			}
		}
	}


}

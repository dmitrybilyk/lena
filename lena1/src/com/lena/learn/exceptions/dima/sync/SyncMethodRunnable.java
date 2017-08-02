package com.lena.learn.exceptions.dima.sync;

public class SyncMethodRunnable implements Runnable {

	private SynchronizedMethodClass synchronizedMethodClass;

	private String threadName;
	
	public SyncMethodRunnable(SynchronizedMethodClass synchronizedMethodClass, String threadName) {
		this.synchronizedMethodClass = synchronizedMethodClass;
		this.threadName = threadName;
	}
	
	public void run() {   
        for (int i = 0; i < 500; i++) {
        	synchronizedMethodClass.syncMethod(threadName);
        }
    }

}
package com.lena.learn.exceptions.dima.sync.syncblock;

public class SyncBlockRunnable implements Runnable {

	private SynchronizedBlockClass synchronizedBlockClass;

	private String threadName;
	
	public SyncBlockRunnable(SynchronizedBlockClass synchronizedBlockClass, String threadName) {
		this.synchronizedBlockClass = synchronizedBlockClass;
		this.threadName = threadName;
	}
	public void run() {
        for (int i = 0; i < 5; i++) {
        	synchronizedBlockClass.syncBlock(threadName);
        }
	}	
}
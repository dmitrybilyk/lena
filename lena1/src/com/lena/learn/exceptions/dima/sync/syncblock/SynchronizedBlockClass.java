package com.lena.learn.exceptions.dima.sync.syncblock;

import java.util.ArrayList;

public class SynchronizedBlockClass {

    private ArrayList<Integer> nums2;
    private String pos2;
    private int counter;
    
    public SynchronizedBlockClass() {
		nums2 = new ArrayList<Integer>();
    	nums2.add(0);
    	pos2 = "0";
    }
	
	public ArrayList<Integer> getNums2() {
		return nums2;
	}

	public void setNums2(ArrayList<Integer> nums2) {
		this.nums2 = nums2;
	}
	
	public String getPos2() {
		return pos2;
	}

	public void setPos2(String pos2) {
		this.pos2 = pos2;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

    public void syncBlock(String threadName) {
    	counter++;
    	System.out.println("Thread " + threadName + " - counter: " + counter);
        synchronized (this) {
        	Integer number = nums2.get(nums2.size() - 1) + 1;
            pos2 = String.valueOf(number);
        	nums2.add(number);
            System.out.println("Thread " + threadName + " Added to list: " 
            		+ nums2.get(nums2.size() - 1) + " - " + pos2);
           }
    }

}
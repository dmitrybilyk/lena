package com.lena.learn.exceptions.dima.sync;

import java.util.ArrayList;

public class SynchronizedMethodClass {

	private ArrayList<Integer> nums1;
	private String pos1;

    public SynchronizedMethodClass() {
    	nums1 = new ArrayList<Integer>();
    	nums1.add(0);
    	pos1 = "0";
    }

	public ArrayList<Integer> getNums1() {
		return nums1;
	}

	public void setNums1(ArrayList<Integer> nums1) {
		this.nums1 = nums1;
	}

	public String getPos1() {
		return pos1;
	}

	public void setPos1(String pos1) {
		this.pos1 = pos1;
	}

	public void syncMethod(String threadName) {
//	public synchronized void syncMethod(String threadName) {
    	Integer number = nums1.get(nums1.size() - 1) + 1;
        pos1 = String.valueOf(number);
        nums1.add(number);
        System.out.println("Thread " + threadName + " : "
+ nums1.get(nums1.size() - 1) + " - " + pos1);
    }
}
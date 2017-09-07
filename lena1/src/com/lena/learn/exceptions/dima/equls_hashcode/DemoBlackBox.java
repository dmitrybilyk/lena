package com.lena.learn.exceptions.dima.equls_hashcode;

import java.util.HashSet;
import java.util.Set;

public class DemoBlackBox {
	public static void main(String[] args) {
		BlackBox object1 = new BlackBox(5, 10);
		BlackBox object2 = new BlackBox(5, 10);
//		System.out.println(object1.equals(object2));
//
//		BlackBox object3 = new BlackBox(5, 10);
//		BlackBox object4 = object3;// Переменная object4 ссылается на
//		//тот-же объект что и переменная object3
//
//		System.out.println(object3.equals(object4));//true

		Set<BlackBox> set = new HashSet<BlackBox>();
		set.add(object1);
		set.add(object2);
		System.out.println(set);
		System.out.println(set.size());
	}
}
package com.yuelchen.util;

public class HeapIndex {

	public static int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}
	
	public static int getLeftChildIndex(int parentIndex) {
		return (2 * parentIndex) + 1;
	}
	
	public static int getRightChildIndex(int parentIndex) {
		return (2 * parentIndex) + 2;
	}
}
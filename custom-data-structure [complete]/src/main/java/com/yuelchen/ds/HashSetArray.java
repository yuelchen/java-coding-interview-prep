package com.yuelchen.ds;

import java.util.ArrayList;
import java.util.List;
import com.yuelchen.util.Hash;

public class HashSetArray<T> {

	/**
	 * The set array to store elements. 
	 */
	private Object[] set;
	
	//====================================================================================================
	
	/**
	 * The set array size limit. 
	 */
	private int arraySize;
	
	//====================================================================================================
	
	/**
	 * The number of elements in the set array.
	 */
	private int size;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 */
	public HashSetArray() {
		this.arraySize = 3;
		this.set = new Object[this.arraySize];
		this.size = 0;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of elements in the set array. 
	 * 
	 * @return				The number of elements in the set array.
	 */
	public int size() {
		return this.size;
	}
	
	//====================================================================================================
	
	/**
	 * Adds the given elements to set array and returns if it was successfully added.
	 * 
	 * @param t				The element to be added to set array.
	 * 
	 * @return				True if the given element was added to set array, otherwise return false.
	 */	
	public boolean add(T t) {
		if(this.size == this.arraySize) {
			if(!this.doubleHashSetArray()) {
				return false;
			}
		}
		
		int hash = Hash.getHash(t, this.arraySize);
		int step = Hash.getStep(hash);
		
		while(this.set[hash] != null) {
			if(this.set[hash] == t) {
				return true;
			}
			
			hash += step;
			hash %= this.arraySize;
		}
		
		this.set[hash] = t;
		this.size++;
		
		return true;
	}
	
	//====================================================================================================
	
	/**
	 * A private method specifically for doubling the size of the current set array. 
	 * 
	 * Returns whether or not the array size was doubled.
	 * 
	 * @return				True if the array size was doubled, otherwise returns false.
	 */
	@SuppressWarnings("unchecked")
	private boolean doubleHashSetArray() {
		int sizeBackup = this.size;
		int arraySizeBackup = this.arraySize;
		Object[] backup = this.set;
		
		try {
			this.arraySize = arraySizeBackup * 2;
			this.set = new Object[this.arraySize];
			this.size = 0;
			
			for(int i=0; i<arraySizeBackup; i++) {
				this.add((T) backup[i]);
			}
			
			return true;
			
		} catch(Exception e) {
			System.out.println("Unable to double array size due to Exception with message " + e.getMessage());
			this.size = sizeBackup;
			this.arraySize = arraySizeBackup;
			this.set = backup;
			
			return false;
		}
	}
	
	//====================================================================================================
	
	/**
	 * Removes the given element from set array; if the element does not exist, simply does nothing.
	 * 
	 * @param t				The element to be removed from set array.
	 */
	public void remove(T t) {
		if(this.size > 0) {
			List<Integer> memo = new ArrayList<Integer>();
			
			int hash = Hash.getHash(t, this.arraySize);
			int step = Hash.getStep(hash);
			
			while(this.set[hash] == null || this.set[hash] != t) {
				if(!memo.contains(Integer.valueOf(hash))) {
					memo.add(Integer.valueOf(hash));
				} else {
					return;
				}
				
				hash += step;
				hash %= this.arraySize;
			}
			
			if(this.set[hash] == t) {
				this.set[hash] = null;
				this.size--;
			}
		}
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns whether or not the set array contains the given element.
	 * 
	 * @param t				The given element to check for in set array. 
	 * 
	 * @return				True if the given element is found in set array, otherwise returns false.
	 */
	public boolean contains(T t) {
		if(this.size > 0) {
			List<Integer> memo = new ArrayList<Integer>();
			
			int hash = Hash.getHash(t, this.arraySize);
			int step = Hash.getStep(hash);
			
			while(this.set[hash] == null || this.set[hash] != t) {
				if(!memo.contains(Integer.valueOf(hash))) {
					memo.add(Integer.valueOf(hash));
				} else {
					return false;
				}
				
				hash += step;
				hash %= this.arraySize;
			}
			
			return this.set[hash] == t;
		}
		
		return false;
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns whether or not the set array is empty (has elements - not size of array).
	 * 
	 * @return				True if the set array is empty.
	 */
	public boolean empty() {
		return this.size == 0;
	}
	
	//====================================================================================================
	
	/**
	 * Clears the set array of all elements. 
	 */
	public void clear() {
		this.set = new Object[this.arraySize];
		this.size = 0;
	}
}
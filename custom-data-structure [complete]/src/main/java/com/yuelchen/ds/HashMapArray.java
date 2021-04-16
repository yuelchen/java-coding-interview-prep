package com.yuelchen.ds;

import java.util.ArrayList;
import java.util.List;

import com.yuelchen.util.Hash;

public class HashMapArray<T, E> {

	/**
	 * An array of keys. 
	 */
	private Object[] key;
	
	//====================================================================================================
	
	/**
	 * An array of values. 
	 */
	private Object[] value;
	
	//====================================================================================================

	/**
	 * The map array size limit. 
	 */
	private int arraySize;
	
	//====================================================================================================

	/**
	 * The number of elements in the map array.
	 */
	private int size;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default). 
	 */
	public HashMapArray() {
		this.arraySize = 3;
		this.key = new Object[this.arraySize];
		this.value = new Object[this.arraySize];
		this.size = 0;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of element in the map array.
	 * 
	 * @return				The number of elements in the map array. 
	 */
	public int getSize() {
		return this.size;
	}
	
	//====================================================================================================
	
	/**
	 * Adds the given key value pair to map and returns if it was successful.
	 * 
	 * If the key already exists, the associated value will be overwritten. 
	 * 
	 * @param t				The key to be used for storing the value.
	 * @param e				The value to be stored. 
	 * 
	 * @return				True if the key value pair is successfully added.
	 */
	public boolean put(T t, E e) {
		if(this.size == this.arraySize) {
			if(!this.doubleHashMapArray()) {
				return false;
			}
		}
		
		int hash = Hash.getHash(t, this.arraySize);
		int step = Hash.getStep(hash);
		
		while(this.key[hash] != null) {
			if(this.key[hash] == t) {
				this.value[hash] = e;
				return true;
			}
			
			hash += step;
			hash %= this.arraySize;
		}
		
		this.key[hash] = t;
		this.value[hash] = e;
		this.size++;
		
		return true;
		
	}
	
	//====================================================================================================
	
	/**
	 * A private method specifically for doubling the size of the current map array. 
	 * 
	 * Returns whether or not the array size was doubled. 
	 * 
	 * @return				True if the array size was doubled, otherwise returns false. 
	 */
	@SuppressWarnings("unchecked")
	private boolean doubleHashMapArray() {
		int sizeBackup = this.size;
		int arraySizeBackup = this.arraySize;
		Object[] keyBackup = this.key;
		Object[] valueBackup = this.value;
		
		try {
			this.arraySize = arraySizeBackup * 2;
			this.key = new Object[this.arraySize];
			this.value = new Object[this.arraySize];
			this.size = 0;
			
			for(int i=0; i<arraySizeBackup; i++) {
				this.put((T) keyBackup[i], (E) valueBackup[i]);
			}
			
			return true;
			
		} catch(Exception e) {
			System.out.println("Unable to double array size due to Exception with message " + e.getMessage());
			this.size = sizeBackup;
			this.arraySize = arraySizeBackup;
			this.key = keyBackup;
			this.value = valueBackup;
			
			return false;
		}
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the value for the given element key, if it exists. 
	 * 
	 * Returns null otherwise if given key does not exist. 
	 * 
	 * @param t				The element key of the value to be returned. 
	 * 
	 * @return				The value for the given element key. 
	 */
	@SuppressWarnings("unchecked")
	public E getValue(T t) {
		if(this.size > 0) {
			List<Integer> memo = new ArrayList<Integer>();
			
			int hash = Hash.getHash(t, this.arraySize);
			int step = Hash.getStep(hash);
			
			while(this.key[hash] == null || this.key[hash] != t) {
				if(!memo.contains(Integer.valueOf(hash))) {
					memo.add(Integer.valueOf(hash));
				} else {
					return null;
				}
				
				hash += step;
				hash %= this.arraySize;
			}
		
			if(this.key[hash] == t) {
				return (E) this.value[hash];
			}
		}
		
		return null;
	}
	
	//====================================================================================================
	
	/**
	 * Removes the given element from map array; if the element does not exist, simply does nothing. 
	 * 
	 * @param t				The element to be removed from map array. 
	 */
	public void remove(T t) {
		if(this.size > 0) {
			List<Integer> memo = new ArrayList<Integer>();
			
			int hash = Hash.getHash(t, this.arraySize);
			int step = Hash.getStep(hash);
			
			while(this.key[hash] == null || this.key[hash] != t) {
				if(!memo.contains(Integer.valueOf(hash))) {
					memo.add(Integer.valueOf(hash));
				} else {
					return;
				}
				
				hash += step;
				hash %= this.arraySize;
			}
		
			if(this.key[hash] == t) {
				this.key[hash] = null;
				this.value[hash] = null;
				this.size--;
			}
		}
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns whether or not the map array contains the given element
	 * 
	 * @param t				The given element to check for in key array. 
	 * 
	 * @return				True if the given element is found in key array, otherwise returns false. 
	 */
	public boolean containsKey(T t) {
		if(this.size > 0) {
			List<Integer> memo = new ArrayList<Integer>();
			
			int hash = Hash.getHash(t, this.arraySize);
			int step = Hash.getStep(hash);
			
			while(this.key[hash] == null || this.key[hash] != t) {
				if(!memo.contains(Integer.valueOf(hash))) {
					memo.add(Integer.valueOf(hash));
				} else {
					return false;
				}
				
				hash += step;
				hash %= this.arraySize;
			}
			
			return this.key[hash] == t;
		}
		
		return false;
	}
	
	//====================================================================================================

	/**
	 * Determines and returns whether or not the map array is empty (has elements - not size of array).
	 * 
	 * @return				True if the map array is empty.
	 */
	public boolean empty() {
		return this.size == 0;
	}
	
	//====================================================================================================

	/**
	 * Clears the kay and value array of all elements. 
	 */
	public void clear() {
		this.key = new Object[this.arraySize];
		this.value = new Object[this.arraySize];
		this.size = 0;
	}
}
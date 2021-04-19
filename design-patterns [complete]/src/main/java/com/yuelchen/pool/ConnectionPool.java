package com.yuelchen.pool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	
	/**
	 * The default limit for max number of connections allowed. 
	 */
	private static final int DEFAULT_SIZE = 3;
	
	//====================================================================================================
	
	/**
	 * A list of saved connections that's been returned to the pool. 
	 */
	private List<Connection> connections;
	
	//====================================================================================================
	
	/**
	 * The limit for max number of connections allowed. 
	 */
	private int poolSize;
	
	//====================================================================================================
	
	/**
	 * The number of connections currently released. 
	 */
	private int released;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 */
	public ConnectionPool() {
		this.connections = new ArrayList<>();
		this.poolSize = DEFAULT_SIZE;
		this.released = 0;
	}
	
	//====================================================================================================
	
	/**
	 * Class constructor. 
	 * 
	 * @param poolSize			The max number of connections allowed. 
	 */
	public ConnectionPool(int poolSize) {
		this.connections = new ArrayList<>();
		this.poolSize = poolSize;
		this.released = 0;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the max number of connections allowed. 
	 * 
	 * @return					The max number of connections allowed. 
	 */
	public int getPoolSizeLimit() {
		return this.poolSize;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of connections currently released. 
	 * 
	 * @return					The number of connections currently released. 
	 */
	public int getReleasedSize() {
		return this.released;
	}
	
	//====================================================================================================
	
	/**
	 * Returns whether or not the pool has any available connections. 
	 * 
	 * @return					True if there are available connections, 
	 * 							otherwise returns false. 
	 */
	public boolean isConnectionFree() {
		return this.released < this.poolSize;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns a connection object if there are any available. 
	 * 
	 * If the connection pool has released the max number of available connections, 
	 * will log a system error and return null. 
	 * 
	 * @return					A connection object if there are any available, 
	 * 							otherwise returns null.
	 */
	public Connection getConnection() {
		if(this.released < this.poolSize) {
			Connection conn;
			if(this.connections.size() > 0) {
				 conn = this.connections.get(0);
			} else {
				conn = new Connection();
			}
			
			this.released++;
			return conn;
			
		} else {
			System.err.println("Max no. of connections reached. Try again later");
		}
		
		return null;
	}
	
	//====================================================================================================
	
	/**
	 * Releases a connection count and saves the given connection object.
	 *  
	 * @param conn				The returned connection object. 
	 */
	public void returnAndSaveConnection(Connection conn) {
		this.released--;
		this.connections.add(conn);
	}
	
	//====================================================================================================
	
	/**
	 * Release a connection count and does NOT save the given connection object. 
	 * 
	 * @param conn				The returned connection object. 
	 */
	public void returnAndRemoveConnection(Connection conn) {
		this.released--;
	}
	
	//====================================================================================================
	
	/**
	 * Clears the any saved connections that are unassigned. 
	 */
	public void clearConnections() {
		this.connections.clear();
	}
}
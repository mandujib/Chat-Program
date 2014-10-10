package data;

import java.io.Serializable;

public class ChatDataPackage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6346019726502891505L;
		
	public static final int INITIALIZE = 0;
	public static final int MESSAGE = 1;
	public static final int EXIT = 2;
	
	private String id;
	private String message;
	private int code;
	
	
	public ChatDataPackage(String id, String message, int code)
	{
		this.id = id;
		this.message = message;
		this.code = code;
	}
	
	public String getId() {
		return id;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getCode() {
		return code;
	}
}

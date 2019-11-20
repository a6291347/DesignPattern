package com.hzh.prototype;

import java.io.Serializable;

public class cat implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5319328688297989706L;
	
	private String name;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public cat(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
			cat cc = (cat) super.clone();
		    return cc;
	}
	

}

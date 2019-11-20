package com.hzh.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class sheep  implements Serializable,Cloneable{
       private String name;
       private String color;
       private cat cc;
	public cat getCc() {
		return cc;
	}
	public void setCc(cat cc) {
		this.cc = cc;
	}
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
	public sheep(String name, String color,cat cc) {
		super();
		this.cc=cc;
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "sheep [name=" + name + ", color=" + color + "]";
	}
/*	//浅拷贝
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		sheep ss = (sheep) super.clone();
		return ss;
	}*/
	
	//深克隆方式一
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		sheep ss = (sheep) super.clone();
		ss.cc=(cat)this.cc.clone();
		return ss;
	}  
	//深克隆方式二 序列化
	public Object sheelClone(){
		//创建对象
		ByteArrayOutputStream byo=null;
		ObjectOutputStream oos=null;
		ByteArrayInputStream byi=null;
		ObjectInputStream ois=null;
		sheep ss =null;
		try {
			//序列化
			byo=new ByteArrayOutputStream();
			oos=new ObjectOutputStream(byo);
			oos.writeObject(this);
			//反序列化
			byi=new ByteArrayInputStream(byo.toByteArray());
			ois=new ObjectInputStream(byi);
			ss = (sheep)ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		finally {
			try {
				if(byo!=null){
					byo.close();
				}
				if(oos!=null){
					oos.close();
				}
				if(byi!=null){
					byi.close();
				}
				if(ois!=null){
					ois.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
		return ss;
	}
}

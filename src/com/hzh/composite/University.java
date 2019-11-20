package com.hzh.composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {
    List<OrganizationComponent> OrganizationComponents=new ArrayList<OrganizationComponent>();

	public University(String name, String des) {
		super(name, des);
	}
    
    @Override
    public void add(OrganizationComponent organizationComponent) {
    	// TODO Auto-generated method stub
    	OrganizationComponents.add(organizationComponent);
    	
    }
	@Override
	public void remove(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		OrganizationComponents.remove(organizationComponent);
	}
	 @Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	 
	 @Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes();
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("-----------"+getName()+"------");
		for(OrganizationComponent item:OrganizationComponents){
			item.print();
		}
	}

}

package com.hzh.command;

public class LightReceiveron implements Command{
	LightReceiver lightReceiveron;
	
	public LightReceiveron(LightReceiver lightReceiveron) {
		this.lightReceiveron = lightReceiveron;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lightReceiveron.on();
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
		lightReceiveron.off();
	}

}

package com.hzh.command;

public class LightReceiveroff  implements Command{
	LightReceiver lightReceiveron;
	
	public LightReceiveroff(LightReceiver lightReceiveron) {
		this.lightReceiveron = lightReceiveron;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lightReceiveron.off();
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
		lightReceiveron.on();
	}

}

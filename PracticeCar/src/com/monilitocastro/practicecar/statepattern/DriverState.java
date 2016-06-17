package com.monilitocastro.practicecar.statepattern;

public class DriverState implements Statelike {
	private DriversActionType action;
	@Override
	public void setAction(StateContext context, Object object) {
		this.action = (DriversActionType)object;
	}
	@Override
	public void next() {
		
	}



}

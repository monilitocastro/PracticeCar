package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.DriversActionType;
import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class Driver{
	private StateContext stateContext;
	private String name;
	private static Driver instance;
	
	public static Driver getInstance(){
		if(instance==null){
			instance = new Driver();
		}
		instance.setName("Driver");
		return instance;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "Driver: " + this.getName();
	}

	public StateContext getStateContext() {
		return stateContext;
	}

	public void setStateContext(StateContext stateContext) {
		this.stateContext = stateContext;
	}
	
	public void newAction(DriversActionType dat){
		Statelike myState = StateFactory.getNewState("Driver");
		stateContext.setState(myState);
	}
	
	public void next(){
	} 
}

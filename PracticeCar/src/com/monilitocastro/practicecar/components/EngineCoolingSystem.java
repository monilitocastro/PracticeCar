package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;

public class EngineCoolingSystem extends StateContext{
	private static EngineCoolingSystem instance;
	
	public static EngineCoolingSystem getInstance(){
		if(instance==null){
			instance = new EngineCoolingSystem();
		}
		instance.setName("EngineCoolingSystem");
		return instance;
	}
}

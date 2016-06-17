package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;

public class Engine extends StateContext{
	private static Engine instance;
	
	public static Engine getInstance(){
		if(instance==null){
			instance = new Engine();
		}
		instance.setName("Engine");
		return instance;

	}
}

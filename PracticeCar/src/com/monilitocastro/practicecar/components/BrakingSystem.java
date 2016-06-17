package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;

public class BrakingSystem extends StateContext{
	private static BrakingSystem instance;
	
	public static BrakingSystem getInstance(){
		if(instance==null){
			instance = new BrakingSystem();
		}
		instance.setName("BrakingSystem");
		return instance;
	}


}

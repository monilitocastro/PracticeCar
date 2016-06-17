package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;

public class IntakeSystem extends StateContext{
	private static IntakeSystem instance;
	
	public static IntakeSystem getInstance(){
		if(instance==null){
			instance = new IntakeSystem();
		}
		instance.setName("IntakeSystem");
		return instance;

	}

}
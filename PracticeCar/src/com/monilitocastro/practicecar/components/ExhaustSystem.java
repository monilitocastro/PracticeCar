package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;

public class ExhaustSystem extends StateContext{
	private static ExhaustSystem instance;
	
	public static ExhaustSystem getInstance(){
		if(instance==null){
			instance = new ExhaustSystem();
		}
		instance.setName("ExhaustSystem");
		return instance;
	}
}

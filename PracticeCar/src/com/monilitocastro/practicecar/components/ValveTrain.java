package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;

public class ValveTrain extends StateContext{
	private static ValveTrain instance;
	
	public static ValveTrain getInstance(){
		if(instance==null){
			instance = new ValveTrain();
		}
		instance.setName("ValveTrain");
		return instance;
	}
}

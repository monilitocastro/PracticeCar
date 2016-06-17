package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;

public class DriveTrain extends StateContext{
	private static DriveTrain instance;
	
	public static DriveTrain getInstance(){
		if(instance==null){
			instance = new DriveTrain();
		}
		instance.setName("DriveTrain");
		return instance;
	}
}

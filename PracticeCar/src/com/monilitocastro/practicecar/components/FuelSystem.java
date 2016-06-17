package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;

public class FuelSystem extends StateContext{
	private static FuelSystem instance;
	
	public static FuelSystem getInstance(){
		if(instance==null){
			instance = new FuelSystem();
		}
		instance.setName("FuelSystem");
		return instance;

	}
}

package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;

public class ElectricalSystem extends StateContext{
	private static ElectricalSystem instance;
	
	public static ElectricalSystem getInstance(){
		if(instance==null){
			instance = new ElectricalSystem();
		}
		instance.setName("ElectricalSystem");
		return instance;


	}
}

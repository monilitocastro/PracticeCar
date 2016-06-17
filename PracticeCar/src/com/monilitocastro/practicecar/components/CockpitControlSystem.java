package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;

public class CockpitControlSystem extends StateContext {
	private static CockpitControlSystem instance;
	
	public static CockpitControlSystem getInstance(){
		if(instance==null){
			instance = new CockpitControlSystem();
		}
		instance.setName("CockpitControlSystem");
		return instance;

	}
}

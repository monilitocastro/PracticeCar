package com.monilitocastro.practicecar.engine;

import com.monilitocastro.practicecar.components.GasPoweredVehicle;
import com.monilitocastro.practicecar.statepattern.AbstractState;

public class EngineRunningLow  extends AbstractState {

	@Override
	public void next(GasPoweredVehicle context, String action) {
		
		// TODO Auto-generated method stub
		System.out.println(context.getName() + ": Engine running at 1600 rpm");
	}



}

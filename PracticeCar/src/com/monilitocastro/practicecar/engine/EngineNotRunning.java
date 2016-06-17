package com.monilitocastro.practicecar.engine;

import com.monilitocastro.practicecar.components.GasPoweredVehicle;
import com.monilitocastro.practicecar.statepattern.AbstractState;

public class EngineNotRunning  extends AbstractState {

	@Override
	public void next(GasPoweredVehicle context, String action) {
		
		System.out.println(context.getName() + ": Engine not running");
	}

}

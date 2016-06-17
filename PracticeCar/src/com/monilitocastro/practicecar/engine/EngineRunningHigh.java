package com.monilitocastro.practicecar.engine;

import com.monilitocastro.practicecar.components.GasPoweredVehicle;
import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class EngineRunningHigh  extends AbstractState {

	@Override
	public void next(GasPoweredVehicle context, String action) {

		// TODO Auto-generated method stub
		System.out.println(context.getName() + ": Engine running at 3000 rpm (best moment to go up a gear)");
		Statelike newState = StateFactory.getNewState("EngineRunningHigh");
		context.setState(newState);
	}


}

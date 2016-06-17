package com.monilitocastro.practicecar.cockpitcontrolsystems;

import com.monilitocastro.practicecar.components.GasPoweredVehicle;
import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateFactory;

public class IgnitionTurned  extends AbstractState{

	@Override
	public void next(GasPoweredVehicle context, String action) {
		System.out.println(context.getName() + ": Ignition is turned.");
		context.setState( StateFactory.getNewState("CircuitCompleteToStarter"));
		//System.out.println(context.getState().toString());
	}



}

package com.monilitocastro.practicecar.cockpitcontrolsystems;

import com.monilitocastro.practicecar.components.GasPoweredVehicle;
import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class IgnitionTurnedOff extends AbstractState{

	@Override
	public void next(GasPoweredVehicle context, String action) {
		System.out.println(context.getName() + ": Ignition turned off");
		Statelike newState = StateFactory.getNewState("CircuitNotCompleteToStarter");
		context.setState(newState);

	}



}

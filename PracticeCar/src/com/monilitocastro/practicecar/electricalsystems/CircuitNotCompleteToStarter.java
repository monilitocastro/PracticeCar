package com.monilitocastro.practicecar.electricalsystems;

import com.monilitocastro.practicecar.components.GasPoweredVehicle;
import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class CircuitNotCompleteToStarter extends AbstractState {

	@Override
	public void next(GasPoweredVehicle context, String action) {
		// TODO Auto-generated method stub
		System.out.println(context.getName() + ": No electricity flowing from battery to starter");
		Statelike newState = StateFactory.getNewState("StarterNotApplyingTorque");
		context.setState(newState);
	}


}

package com.monilitocastro.practicecar.electricalsystems;

import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class IgnitionTurnedOff implements Statelike {

	@Override
	public void next(StateContext context, String action) {
		System.out.println(context.getName() + ": Ignition turned off");
		Statelike newState = StateFactory.getNewState("CircuitNotCompleteToStarter");
		context.setState(newState);

	}

}

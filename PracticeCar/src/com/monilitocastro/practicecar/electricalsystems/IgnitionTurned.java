package com.monilitocastro.practicecar.electricalsystems;

import com.monilitocastro.practicecar.components.ElectricalSystem;
import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class IgnitionTurned implements Statelike{

	@Override
	public void next(StateContext context, String action) {
		System.out.println(context.getName() + ": Ignition is turned.");
		Statelike newState = StateFactory.getNewState("IgnitionTurned");
		context.setState(newState);
		ElectricalSystem es = ElectricalSystem.getInstance();
		es.next("CircuitCompleteToStarter");
	}

}

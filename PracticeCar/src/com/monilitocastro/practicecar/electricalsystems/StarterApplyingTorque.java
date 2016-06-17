package com.monilitocastro.practicecar.electricalsystems;

import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class StarterApplyingTorque extends AbstractState  {

	@Override
	public void next(StateContext context, String action) {
		System.out.println(context.getName() + ": Starter applying torque");
		Statelike newState = StateFactory.getNewState("FlyWheelTorqueApplied");
		context.setState(newState);
	}



}

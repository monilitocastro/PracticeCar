package com.monilitocastro.practicecar.electricalsystems;

import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class CircuitNotCompleteToStarter implements Statelike {

	@Override
	public void next(StateContext context, String action) {
		// TODO Auto-generated method stub
		System.out.println(context.getName() + ": No electricity flowing from battery to starter");
		Statelike newState = StateFactory.getNewState("StarterNotApplyingTorque");
		context.setState(newState);
	}

}

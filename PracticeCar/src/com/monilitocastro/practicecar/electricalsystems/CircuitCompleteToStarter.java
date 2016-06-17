package com.monilitocastro.practicecar.electricalsystems;

import com.monilitocastro.practicecar.components.Engine;
import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class CircuitCompleteToStarter  extends AbstractState implements Statelike {

	@Override
	public void next(StateContext context, String action) {
		System.out.println(context.getName() + ": Starter turning.");
		Engine e = Engine.getInstance();
		Statelike newState = StateFactory.getNewState("StarterApplyingTorque");
		context.setState(newState);
	}



}

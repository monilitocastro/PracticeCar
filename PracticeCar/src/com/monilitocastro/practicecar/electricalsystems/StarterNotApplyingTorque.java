package com.monilitocastro.practicecar.electricalsystems;

import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateContext;

public class StarterNotApplyingTorque  extends AbstractState  {

	@Override
	public void next(StateContext context, String action) {
		System.out.println(context.getName() + ": Starter not applying torque");
		
	}



}

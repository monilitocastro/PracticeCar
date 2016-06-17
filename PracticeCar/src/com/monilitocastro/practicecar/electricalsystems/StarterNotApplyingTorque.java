package com.monilitocastro.practicecar.electricalsystems;

import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class StarterNotApplyingTorque implements Statelike {

	@Override
	public void next(StateContext context, String action) {
		System.out.println(context.getName() + ": Starter not applying torque");
		
	}

}

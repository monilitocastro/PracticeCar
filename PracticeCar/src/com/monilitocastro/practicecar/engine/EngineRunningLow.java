package com.monilitocastro.practicecar.engine;

import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateContext;

public class EngineRunningLow  extends AbstractState {

	@Override
	public void next(StateContext context, String action) {
		// TODO Auto-generated method stub
		System.out.println(context.getName() + ": Engine running at 1600 rpm");
	}



}

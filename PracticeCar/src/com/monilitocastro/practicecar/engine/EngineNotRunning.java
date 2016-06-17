package com.monilitocastro.practicecar.engine;

import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateContext;

public class EngineNotRunning  extends AbstractState {

	@Override
	public void next(StateContext context, String action) {
		
		System.out.println(context.getName() + ": Engine not running");
	}

}

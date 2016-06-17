package com.monilitocastro.practicecar.engine;

import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class EngineNotRunning implements Statelike {

	@Override
	public void next(StateContext context, String action) {
		System.out.println(context.getName() + ": Engine not running");
	}
	
}

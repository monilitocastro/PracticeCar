package com.monilitocastro.practicecar.engine;

import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class EngineRunningLow implements Statelike {

	@Override
	public void next(StateContext context, String action) {
		// TODO Auto-generated method stub
		System.out.println(context.getName() + ": Engine running at 1600 rpm");
	}

}

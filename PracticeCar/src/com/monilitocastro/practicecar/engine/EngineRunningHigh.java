package com.monilitocastro.practicecar.engine;

import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class EngineRunningHigh implements Statelike {

	@Override
	public void next(StateContext context, String action) {
		// TODO Auto-generated method stub
		System.out.println(context.getName() + ": Engine running at 3000 rpm (best moment to go up a gear)");
	}

}

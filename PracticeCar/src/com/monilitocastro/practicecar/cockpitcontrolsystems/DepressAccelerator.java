package com.monilitocastro.practicecar.cockpitcontrolsystems;

import com.monilitocastro.practicecar.components.Engine;
import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class DepressAccelerator  extends AbstractState{
	
	@Override
	public void next(StateContext context, String control){
		System.out.println(context.getName() + ": Accelerator depressed");
		Engine e = Engine.getInstance();
		Statelike newState = StateFactory.getNewState("EngineRunningHigh");
		e.setState(newState);
	}
}

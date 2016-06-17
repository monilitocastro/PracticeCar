package com.monilitocastro.practicecar.cockpitcontrolsystems;

import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class ReleaseAccelerator extends AbstractState{

	@Override
	public void next(StateContext context, String action) {
		
		// TODO Auto-generated method stub
		System.out.println(context.getName() + ": Accelerator released");
		Statelike newState = context.getState();
		Statelike c1 = StateFactory.getNewState("EngineRunningLow");
		Statelike c2 = StateFactory.getNewState("EngineRunningHigh");
		if(newState.equals(c1) || newState.equals(c2) ){
			newState = StateFactory.getNewState("EngineRunningLow");
		}else{
			System.out.println(context.getName() + ": Engine not running so nothing happened");
		}
		context.setState(newState);
	}
}

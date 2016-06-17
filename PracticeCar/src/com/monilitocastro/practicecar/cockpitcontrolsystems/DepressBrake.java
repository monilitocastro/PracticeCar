package com.monilitocastro.practicecar.cockpitcontrolsystems;

import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class DepressBrake extends AbstractState{
	
	@Override
	public void next(StateContext context, String control){
		System.out.println(context.getName() + ": Brake depressed");
		Statelike newState = context.getState();
		//Statelike c1 = StateFactory.getNewState("EngineRunningLow");
		Statelike c2 = StateFactory.getNewState("EngineRunningHigh");
		if(newState.equals(c2) ){
			context.setState(StateFactory.getNewState("EngineRunningLow") );
		}else{
			System.out.println(context.getName() + ": Engine not running so nothing happened");
		}
		
	}
}

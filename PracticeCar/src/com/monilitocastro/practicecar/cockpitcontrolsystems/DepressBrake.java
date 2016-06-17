package com.monilitocastro.practicecar.cockpitcontrolsystems;

import com.monilitocastro.practicecar.components.Engine;
import com.monilitocastro.practicecar.components.GasPoweredVehicle;
import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class DepressBrake extends AbstractState{
	
	@Override
	public void next(StateContext context, String control){
		System.out.println(context.getName() + ": Brake depressed");
		Statelike newState = context.getState();
		Statelike c1 = StateFactory.getNewState("EngineRunningLow");
		Statelike c2 = StateFactory.getNewState("EngineRunningHigh");
		if(newState.equals(c1) || newState.equals(c2) ){
			Engine.getInstance().setState(StateFactory.getNewState("EngineRunningLow") );
			GasPoweredVehicle.getInstance().setState(StateFactory.getNewState("VehicleStopped"));
		}else{
			System.out.println(context.getName() + ": Engine not running so nothing happened");
		}
		
	}
}

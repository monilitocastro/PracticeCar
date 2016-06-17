package com.monilitocastro.practicecar.cockpitcontrolsystems;

import com.monilitocastro.practicecar.components.GasPoweredVehicle;
import com.monilitocastro.practicecar.engine.EngineRunningHigh;
import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class DepressBrake extends AbstractState{
	
	@Override
	public void next(GasPoweredVehicle context, String control){
		System.out.println(context.getName() + ": Brake depressed");
		Statelike newState = context.getOldState();
		//System.out.println("newState is type " + newState.getClass().toString() );
		if(newState instanceof EngineRunningHigh ){
			context.setState(StateFactory.getNewState("EngineRunningLow") );
			System.out.println(context.getName() + ": Deccelerating from 3000 rpm");
		}else{
			System.out.println(context.getName() + ": Either Engine not running or is already slow so nothing happened");
		}
		
	}
}

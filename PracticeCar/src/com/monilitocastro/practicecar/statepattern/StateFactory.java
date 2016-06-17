package com.monilitocastro.practicecar.statepattern;

import com.monilitocastro.practicecar.electricalsystems.CircuitNotCompleteToStarter;
import com.monilitocastro.practicecar.electricalsystems.StarterApplyingTorque;
import com.monilitocastro.practicecar.cockpitcontrolsystems.IgnitionTurned;
import com.monilitocastro.practicecar.cockpitcontrolsystems.IgnitionTurnedOff;
import com.monilitocastro.practicecar.electricalsystems.CircuitCompleteToStarter;
import com.monilitocastro.practicecar.electricalsystems.StarterNotApplyingTorque;
import com.monilitocastro.practicecar.engine.EngineNotRunning;
import com.monilitocastro.practicecar.engine.EngineRunningHigh;
import com.monilitocastro.practicecar.engine.EngineRunningLow;
import com.monilitocastro.practicecar.engine.FlyWheelTorqueApplied;

public class StateFactory {

	public static Statelike getNewState(String newState) {
		Statelike result = null;
		if(newState.equals("IgnitionTurned") ){
			result = new IgnitionTurned();
		}else if(newState.equals("CircuitCompleteToStarter") ){
			result = new CircuitCompleteToStarter();
		}else if(newState.equals("StarterApplyingTorque") ){
			result = new StarterApplyingTorque();
		}else if(newState.equals("FlyWheelTorqueApplied") ){
			result = new FlyWheelTorqueApplied();
		}else if(newState.equals("EngineNotRunning") ){
			result = new EngineNotRunning();
		}else if(newState.equals("EngineRunningLow") ){
			result = new EngineRunningLow();
		}else if(newState.equals("EngineRunningHigh") ){
			result = new EngineRunningHigh();
		}else if(newState.equals("IgnitionTurnedOff") ){
			result = new IgnitionTurnedOff();
		}else if(newState.equals("StarterNotApplyingTorque") ){
			result = new StarterNotApplyingTorque();
		}else if(newState.equals("CircuitNotCompleteToStarter") ){
			result = new CircuitNotCompleteToStarter();
		}
		
		
		
		
		
		return result;
	}
	
}

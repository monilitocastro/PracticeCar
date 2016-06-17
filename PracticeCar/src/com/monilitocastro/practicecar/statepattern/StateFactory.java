package com.monilitocastro.practicecar.statepattern;

import com.monilitocastro.practicecar.electricalsystems.StarterApplyingTorque;
import com.monilitocastro.practicecar.electricalsystems.CircuitCompleteToStarter;
import com.monilitocastro.practicecar.electricalsystemstates.IgnitionTurned;
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
		}
		
		
		
		return result;
	}
	
}

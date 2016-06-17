package com.monilitocastro.practicecar.engine;

import java.util.Random;

import com.monilitocastro.practicecar.statepattern.AbstractState;
import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class FlyWheelTorqueApplied extends AbstractState {


	public void next(StateContext context, String action) {
		
		System.out.println(context.getName() + ": Flywheel torque applied ");
		Statelike oldState =  context.getState();
		Statelike newState = null;
		if(	(oldState instanceof EngineNotRunning)){
			System.out.println(context.getName() + ": *aaaYEEEeeeh* *aaaYEEEeeeh* *aaaYEEEeeeh* ...");
			int rnd = new Random().nextInt(10);
			if(rnd<3){
				newState = StateFactory.getNewState("EngineRunningLow");
				System.out.println(context.getName() + ": *VROOM* *VROOM* *VROOM*");
				context.setState(newState);
			}else{
				System.out.println(context.getName() + ": *sputter* *sputter* *sputter* (just keep at it)");
			}
		}else if(  (oldState instanceof EngineRunningLow)
				|| (oldState instanceof EngineRunningHigh)) {
			System.out.println(context.getName() + ": *high pitch coming from starter* (stop applying torque to flywheel please!)");
		}
		
		
		
	}




}

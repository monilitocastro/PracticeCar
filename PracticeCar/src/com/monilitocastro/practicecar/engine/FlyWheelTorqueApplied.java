package com.monilitocastro.practicecar.engine;

import java.util.Random;

import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class FlyWheelTorqueApplied implements Statelike {

	@Override
	public void next(StateContext context, String action) {
		System.out.println(context.getName() + ": Flywheel is turning");
		Statelike oldState =  context.getOldState();
		Statelike newState = null;
		if(	(oldState instanceof EngineNotRunning)){
			System.out.println(context.getName() + ": *aaaYEEEeeeh* *aaaYEEEeeeh* *aaaYEEEeeeh* ...");
			int rnd = new Random().nextInt(10);
			if(rnd<10){
				newState = StateFactory.getNewState("EngineRunningLow");
				System.out.println(context.getName() + ": *VROOM* *VROOM* *VROOM*");
			}else{
				System.out.println(context.getName() + ": *sputter* *sputter* *sputter*");
			}
		}else if(  (oldState instanceof EngineRunningLow)
				|| (oldState instanceof EngineRunningHigh)) {
			System.out.println(context.getName() + ": *high pitch coming from starter* (stop applying torque to flywheel please!)");
		}
		
		
		context.setState(newState);
	}

}

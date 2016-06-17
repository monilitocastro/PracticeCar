package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class GasPoweredVehicle extends StateContext{

	private static GasPoweredVehicle instance;
	
	public static GasPoweredVehicle getInstance(){
		if(instance==null){
			instance = new GasPoweredVehicle();
			instance.setName("GasPoweredVehicle");
			instance.myState = StateFactory.getNewState("EngineNotRunning");
			instance.myState.next(instance, "");
		}
		
		return instance;
	}
	
	private String carName;
	
	public void command(String cmd){
		if(cmd.equals("IgnitionTurned") ){
			this.myState = StateFactory.getNewState("IgnitionTurned");
			
		}else if(cmd.equals("next")){
			//myState = StateFactory.getNewState("CircuitCompleteToStarter");
			
		}else if(cmd.equals("DepressAccelerator")){
			//myState = StateFactory.getNewState("CircuitCompleteToStarter");
			myState = StateFactory.getNewState("DepressAccelerator");
		}else if(cmd.equals("IgnitionTurnedOff")){
			//myState = StateFactory.getNewState("CircuitCompleteToStarter");
			myState = StateFactory.getNewState("IgnitionTurnedOff");
		}else if(cmd.equals("DepressBrake")){
			//myState = StateFactory.getNewState("CircuitCompleteToStarter");
			myState = StateFactory.getNewState("DepressBrake");
		}else if(cmd.equals("info")){
			String s = 	"\n*******************************************************************\n"
					+	"Welcome to PracticeCar\n"
					+   "This demo implements a state machine"
					+   "with the following commands: \n"
					+   "IgnitionTurned DepressAccelerator DepressBrake IgnitionTurnedOff info\n"
					+   "you can also enter a blank line or next to keep going. \n"
					+ 	"*******************************************************************\n";
			System.out.println(s);
			return;
		}
		
		myState.next(instance,"");
	} 

	
	public String toString(){
		return "Car name: " + this.getCarName();
	}
	public String getCarName(){
		return carName;
	}
	public void setCarName(String carName){
		this.carName = carName;
	}

	
}

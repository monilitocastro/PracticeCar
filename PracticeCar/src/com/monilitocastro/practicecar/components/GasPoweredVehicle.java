package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class GasPoweredVehicle extends StateContext{

	private static Statelike myState;
	private static GasPoweredVehicle instance;
	
	public static GasPoweredVehicle getInstance(){
		if(instance==null){
			instance = new GasPoweredVehicle();
			instance.setName("GasPoweredVehicle");
			myState = StateFactory.getNewState("EngineNotRunning");
			myState.next(instance, "");
		}
		
		return instance;
	}
	
	private String carName;
	
	public void command(String cmd){
		if(cmd.equals("IgnitionTurned") ){
			myState = StateFactory.getNewState("IgnitionTurned");
			
		}else if(cmd.equals("next")){
			//myState = StateFactory.getNewState("CircuitCompleteToStarter");
			
		}
		
		myState.next(instance,"");
	} 
	public void setState(Statelike s){
		this.setOldState( myState);
		myState = s;
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

package com.monilitocastro.practicecar.components;

import com.monilitocastro.practicecar.statepattern.StateContext;
import com.monilitocastro.practicecar.statepattern.StateFactory;
import com.monilitocastro.practicecar.statepattern.Statelike;

public class GasPoweredVehicle extends StateContext{
	protected Engine engine;
	protected EngineCoolingSystem engineCoolingSystem;
	protected IntakeSystem intakeSystem;
	protected FuelSystem fuelSystem;
	protected ValveTrain valveTrain;
	protected ElectricalSystem electricalSystem;
	protected DriveTrain driveTrain;
	protected BrakingSystem brakingSystem;
	private static Statelike myState;
	private static GasPoweredVehicle instance;
	
	public static GasPoweredVehicle getInstance(){
		if(instance==null){
			instance = new GasPoweredVehicle();
			myState = StateFactory.getNewState("EngineNotRunning");
			myState.next(Engine.getInstance(), "");
		}
		
		instance.setName("GasPoweredVehicle");
		return instance;
	}
	
	private String carName;
	private Driver driver;
	
	public void command(String cmd){
		if(cmd.equals("IgnitionTurned") ){
			myState = StateFactory.getNewState("IgnitionTurned");
			myState.next(ElectricalSystem.getInstance(),"");
		}
	}
	
	public GasPoweredVehicle setEngine(Engine engine){
		this.engine = engine;
		return this;
	}
	public GasPoweredVehicle setEngineCoolingSystem(EngineCoolingSystem engineCoolingSystem){
		this.engineCoolingSystem = engineCoolingSystem;
		return this;
	}
	public GasPoweredVehicle setIntakeSystem(IntakeSystem intakeSystem){
		this.intakeSystem = intakeSystem;
		return this;
	}
	public GasPoweredVehicle setFuelSystem(FuelSystem fuelSystem){
		this.fuelSystem = fuelSystem;
		return this;
	}
	public GasPoweredVehicle setValveTrain(ValveTrain valveTrain){
		this.valveTrain = valveTrain;
		return this;
	}
	public GasPoweredVehicle setElectricalSystem(ElectricalSystem electricalSystem){
		this.electricalSystem = electricalSystem;
		return this;
	}
	public GasPoweredVehicle setDriveTrain(DriveTrain driveTrain){
		this.driveTrain = driveTrain;
		return this;
	}
	public GasPoweredVehicle setBrakingSystem(BrakingSystem brakingSystem){
		this.brakingSystem = brakingSystem;
		return this;
	}
	
	
	
	public String toString(){
		return "Car name: " + this.getCarName()          + "\n" 
	                        + this.driver.toString();
	}
	public String getCarName(){
		return carName;
	}
	public void setCarName(String carName){
		this.carName = carName;
	}
	public Driver getDriver(){
		return this.driver;
	}
	public void setDriver(Driver driver){
		this.driver = driver;
	}
	
}

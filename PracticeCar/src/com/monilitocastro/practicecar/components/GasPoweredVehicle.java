package com.monilitocastro.practicecar.components;

public abstract class GasPoweredVehicle {
	protected Engine engine;
	protected EngineCoolingSystem engineCoolingSystem;
	protected IntakeSystem intakeSystem;
	protected FuelSystem fuelSystem;
	protected ValveTrain valveTrain;
	protected ElectricalSystem electricalSystem;
	protected DriveTrain driveTrain;
	protected BrakingSystem brakingSystem;
	
	
	private String carName;
	private Driver driver;
	
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

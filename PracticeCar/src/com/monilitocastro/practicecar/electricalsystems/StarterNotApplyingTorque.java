package com.monilitocastro.practicecar.electricalsystems;

import com.monilitocastro.practicecar.components.GasPoweredVehicle;
import com.monilitocastro.practicecar.statepattern.AbstractState;

public class StarterNotApplyingTorque  extends AbstractState  {

	@Override
	public void next(GasPoweredVehicle context, String action) {
		System.out.println(context.getName() + ": Starter not applying torque");
		
	}



}

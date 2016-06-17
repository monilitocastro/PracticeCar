package com.monilitocastro.practicecar.statepattern;

import com.monilitocastro.practicecar.components.GasPoweredVehicle;

public interface Statelike {
	public void next(GasPoweredVehicle context, String action);

}

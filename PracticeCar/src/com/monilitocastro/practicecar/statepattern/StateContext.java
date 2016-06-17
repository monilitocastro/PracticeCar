package com.monilitocastro.practicecar.statepattern;

public abstract class StateContext {
    private Statelike myState;
    private Statelike oldState;
    private String name;
    /**
     * Setter method for the state.
     * Normally only called by classes implementing the State interface.
     * @param newState the new state of this context
     */
    public void setState(final Statelike newState) {
    	setOldState(myState);
        myState = newState;
    }
    public void next( String action){
    	myState.next(this, action);
    }
    public Statelike getState(){
    	return myState;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Statelike getOldState() {
		return oldState;
	}
	public void setOldState(Statelike oldState) {
		this.oldState = oldState;
	}
}

package com.monilitocastro.practicecar.statepattern;

import java.util.Hashtable;
import java.util.Set;

public abstract class StateContext {
    private Statelike myState;
    private Statelike oldState;
    private String name;
    private Hashtable<Statelike, Statelike> left;
    private Hashtable<Statelike, Statelike> right;
    private Set<Statelike> persistentState;
    public void setMutualExclusion(){
    	
    }
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
	private void setOldState(Statelike oldState) {
		this.oldState = oldState;
	}
	public Set<Statelike> getPersistentState() {
		return persistentState;
	}
	private void setPersistentState(Set<Statelike> persistentState) {
		this.persistentState = persistentState;
	}
}

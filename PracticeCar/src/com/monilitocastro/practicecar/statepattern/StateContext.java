package com.monilitocastro.practicecar.statepattern;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public abstract class StateContext {
    private Statelike myState;
    private Statelike oldState;
    private String name;
    private Map<Statelike, Statelike> left;
    private Map<Statelike, Statelike> right;
    private Set<Statelike> persistentState;
    public void setMutualExclusion(Statelike l, Statelike r){
    	if(left==null){
    		left = new Hashtable<Statelike, Statelike>();
    	}
    	if(right==null){
    		right = new Hashtable<Statelike, Statelike>();
    	}
    	left.put(l, r);
    	right.put(r, l);
    }
    public void removeMutualExclusion(Statelike l, Statelike r){
    	if(left==null){
    		left = new Hashtable<Statelike, Statelike>();
    	}
    	if(right==null){
    		right = new Hashtable<Statelike, Statelike>();
    	}
    	if(left.containsKey(l)){
    		Statelike r2 = left.get(l);
    		if(r2.equals(r) ){
    			left.remove(l);
    			right.remove(r);
    		}else{
        		throw new IllegalStateException("*EXCEPTION* " + getName() + ": Cannot remove from mutual exclusion map. Right-state does not match");
        	}
    	}else{
    		throw new IllegalStateException("*EXCEPTION* " + getName() + ": Cannot remove from mutual exclusion map. Left-state does not match");
    	}
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
	private void insertPersistentState(Statelike state) {
		Itera
	}
}

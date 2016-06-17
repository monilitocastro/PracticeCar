package com.monilitocastro.practicecar.statepattern;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class StateContext {
    private Statelike myState;
    private Statelike oldState;
    private String name;
    private Map<Statelike, Statelike> left;
    private Set<Statelike> persistentState;
    public void setMutualExclusion(Statelike l, Statelike r){
    	if(left==null){
    		left = new Hashtable<Statelike, Statelike>();
    	}
    	if(left.containsKey(l)){
    		throw new IllegalStateException("Please remove left Statelike object from exclusion model before re-inserting");
    	}
    	if(left.containsKey(r)){
    		throw new IllegalStateException("Please remove left Statelike object from exclusion model before re-inserting");
    	}
    	left.put(l, r);
    	left.put(r, l);
    }
   
    public void removeMutualExclusion(Statelike l, Statelike r){
    	if(left==null){
    		left = new Hashtable<Statelike, Statelike>();
    	}
 
    	if(left.containsKey(l)){
    		Statelike r2 = left.get(l);
    		if(r2.equals(r) ){
    			left.remove(l);
    			left.remove(r);
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
		if(!persistentState.contains(state)){
			Statelike r = left.get(state);
			if(persistentState.contains(r) ){
				persistentState.remove(r);
			}
			persistentState.add(state);
		}
		
	}
}

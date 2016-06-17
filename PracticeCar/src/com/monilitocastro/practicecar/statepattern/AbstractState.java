package com.monilitocastro.practicecar.statepattern;

import java.util.Comparator;

public abstract class AbstractState implements Statelike, Comparator{
	public boolean equals(Object o){
		if(!(o instanceof Statelike) ){
			throw new IllegalStateException("object to compare is not Statelike");
		}else{
			return o.getClass().equals(this.getClass());
		}
	}
	
	public int compare(Object o1, Object o2){
		return o1.getClass().toString().compareTo(o2.getClass().toString() );
	}
	public void next(StateContext context, String action){
		System.out.println("Entered state: " + this.getClass( ) );
	}
	protected void persistIn(StateContext context){
		context.insertPersistentState(this);
	}
}

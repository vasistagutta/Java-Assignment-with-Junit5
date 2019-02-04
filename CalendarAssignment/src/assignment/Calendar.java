package assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Calendar {
	private static final int MAXEVENTS=4;
	private Event[] events;
	private int numEvents;
	
	public Calendar() {
		events = new Event[MAXEVENTS];
		numEvents =0;
	}
	
	public boolean addEvent(Event e) {
		if(this.numEvents == MAXEVENTS) {
			return false;
		}else {
			for(int i=0;i<=numEvents;i++) {
				if(null == events[i]) {
					events[i]= e;
				}
			}
			this.numEvents = this.numEvents +1;
			return true;
		}
		
	}
	
	public int findEvent(Event e) throws NullPointerException {
		int index = -1;
		for(int i=0 ; i<numEvents; i++) {
			if(null != events[i]) {
				if(this.events[i].equals(e)) {
					index = i;
				}
			}else {
				throw new NullPointerException("Event object of index +"+ i+"  is null");
			}
			
		}
		return index;
		
	}
	
	
	public boolean removeEvent(Event e) {
		if(null != e) {
			if(this.findEvent(e)!= -1) {
				this.events[this.findEvent(e)]= null;
				this.numEvents--;
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	public void dump() {
		for(int i=0; i<this.events.length; i++) {
			if(null !=events[i]) {
				System.out.println(events[i].toString());
			}
		}
	}
	
	
}

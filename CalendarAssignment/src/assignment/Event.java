package assignment;

public class Event {

	private Date date;
	private int start;
	private int end;
	private String description;
	
	public Event(Date date, int start, int end, String description) {
		//constructor body
		if(!(start<=end)) {
			throw new IllegalArgumentException();
		}
		if( start < 0 || start > 23) {
			throw new IllegalArgumentException();
		}else {
			this.start = start;
		}
		if( end < 0 || end > 23) {
			throw new IllegalArgumentException();
		}else {
			this.end = end;
		}
		this.date = date;
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return  this.getDate().getMonth() +"/" + this.getDate().getDay() + "/"+ this.getDate().getYear() + " "+ this.getStart()+"--"+this.getEnd()+": "+this.getDescription();
	}
	
	public boolean equals(Object obj) throws IllegalArgumentException {
    	boolean check = false;
    	if(obj instanceof Event) {
    		Event otherEvent = (Event)obj;
           
            if(this.getDate().equals(otherEvent.getDate()))
            	if(this.getStart() == otherEvent.getStart())
            		if(this.getEnd() == otherEvent.getEnd())
            			if(this.getDescription().equals(otherEvent.getDescription()))
            				check= true;
    	}else {
    		throw new IllegalArgumentException("Please pass the Event instance as a object");
    	}
        
		return check;
    }
}

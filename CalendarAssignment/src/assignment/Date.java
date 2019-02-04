package assignment;

import java.io.ObjectStreamException;

import org.hamcrest.core.IsInstanceOf;

public class Date implements Comparable<Date> {
    
	private int year;
	private int month;
	private int day;

    public Date(int year, int month, int day) throws IllegalArgumentException {
    	if (year<2014 ||year>2020) {
    		throw new IllegalArgumentException();
    	}else {
    		this.year= year;
    	}
    	if (month<1 || month>12) {
    		throw new IllegalArgumentException();
    	}else {
    		this.month= month;
    	}
    	if (day <1 || day>31) {
    		throw new IllegalArgumentException();
    	}else {
    		this.day= day;
    	}
    }
    
    public int getYear() {
		return year;
	}


	public int getMonth() {
		return month;
	}


	public int getDay() {
		return day;
	}
	
	

    @Override
	public String toString() {
		return this.getMonth()+ "/"+ this.getDay() + "/" + this.getYear();
	}
    
    public boolean equals(Object obj) throws IllegalArgumentException {
    	boolean check = false;
    	if(obj instanceof Date) {
    		Date otherDate = (Date)obj;
           
            if(this.getYear()== otherDate.getYear() )
            	if(this.getMonth() == otherDate.getMonth())
            		if(this.getDay() == otherDate.getDay())
            			check= true;
    	}else {
    		throw new IllegalArgumentException("Please pass the date object as a object");
    	}
        
		return check;
    }

    
	@Override
    public int compareTo(Date otherDate) {
		if(this.equals(otherDate)) {
			return 0;
		}else {
			if(this.getYear()<otherDate.getYear()) {
				return -1;
			}else {
				if(this.getMonth() < otherDate.getMonth()) {
					return -1;
				}else {
					if(this.getDay()< otherDate.getDay()) {
						return -1;
					}else {
						return 1;
					}
				}
			}
		}
    }

}

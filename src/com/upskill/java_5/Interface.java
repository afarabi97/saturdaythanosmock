package com.upskill.java_5;

public interface Interface {
	
	//Interface can have only abstract methods, java 8 and forward they have static method too
	
	//Abstract method doesn't have any implementation
	
	public abstract void iDoor();
	
	public abstract void iSeat();
	
	public abstract void iWheel();
	
	public abstract void iRadio();
	
	public abstract int iSpeaker();

}


/*
	(Parent)				(Keyword) 				(Child)
	Class						extends				 Class
	Abstract Class				extends				 Class
	Interface					implements	  		 Class
	Interface					extends				 Interface			implements     Class

*/
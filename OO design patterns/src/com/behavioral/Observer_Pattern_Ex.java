package com.behavioral;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
 * 
 * e.g
 * 
 * 
 * 	Door
 * 
 * 		- open
 * 		- close
 * 
 *  Light
 *  
 *  	- on
 *      - off
 *      
 *  Fan
 *  
 *     - on
 *     - off 	
 * 
 * 
 */

interface DoorListener {
	public void on();

	public void off();
}

class Light implements DoorListener {
	public void on() {
		System.out.println("Light ON");
	}

	public void off() {
		System.out.println("Light OFF");
	}
}

class Fan implements DoorListener {
	public void on() {
		System.out.println("Fan ON");
	}

	public void off() {
		System.out.println("Fan OFF");
	}
}

class AC implements DoorListener {
	public void on() {
		System.out.println("AC ON");
	}

	public void off() {
		System.out.println("AC OFF");
	}
}

class Door {

	private List<DoorListener> doorListeners = new ArrayList<DoorListener>();

	public void addDoorListener(DoorListener doorListener) {
		this.doorListeners.add(doorListener);
	}

	public void removeDoorListener(DoorListener doorListener) {
		this.doorListeners.remove(doorListener);
	}

	public void open() {
		System.out.println("door opened..");
		doorListeners.forEach(listener -> listener.on());
	}

	public void close() {
		System.out.println("door closed..");
		doorListeners.forEach(listener -> listener.off());
	}
}

public class Observer_Pattern_Ex {

	public static void main(String[] args) throws InterruptedException {

		Door door = new Door();

		DoorListener light = new Light();
		DoorListener fan = new Fan();
		DoorListener ac = new AC();

		door.addDoorListener(light);
		door.addDoorListener(fan);
		door.addDoorListener(ac);
		
		door.removeDoorListener(fan);

		TimeUnit.SECONDS.sleep(3);
		door.open();
		TimeUnit.SECONDS.sleep(3);
		door.close();

	}

}

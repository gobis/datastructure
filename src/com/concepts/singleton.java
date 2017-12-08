package com.concepts;

public class singleton implements Cloneable {

	protected singleton clone() {
		try {
			// call clone in Object.
			return (singleton) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed.");
			return this;
		}
	}

}

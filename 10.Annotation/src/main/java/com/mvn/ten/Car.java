package com.mvn.ten;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private Model model;

	public Car() {
		super();
	}

	public Car(Model model) {
		super();
		System.out.println("This is constructor");

		this.model = model;
	}

	@Autowired
	public void setModel(Model model) {
		System.out.println("This is setter method");
		this.model = model;
	}

	public Model getModel() {
		return model;
	}

	public void carStarted() {
		if (model != null) {
			model.start();
		} else {
			System.out.println("Car Not Started");

		}
	}
}

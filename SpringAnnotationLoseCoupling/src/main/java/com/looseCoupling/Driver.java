package com.looseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Interface.Car;

@Component
public class Driver {

	@Qualifier("benz")
	@Autowired
	Car car;

	public void startTheCar() {
		car.start();
	}

	public void stopTheCar() {
		car.stop();
	}

}

package com.lti.practice;

public class Car implements vehicle
{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("heloo ");
		
	}

	public static void main(String[] args) {
		new Car().start();
		
		
		vehicle.stop();
		
	}
}

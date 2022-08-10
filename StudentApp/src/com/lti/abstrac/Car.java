package com.lti.abstrac;

  abstract class Vehicle
{
	abstract void start();
	abstract void stop();
	
}

class Car extends Vehicle
{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Car started");
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car stopped");
		
	}
	
	void drive()
	{
		System.out.println("Car driving");
	}

	public static void main(String[] args) {
		Vehicle c=new Car();
		c.start();
		c.stop();
		Car cc=new Car();
		cc.drive();
	}
	
}

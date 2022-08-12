abstract class Vehicle
{
	abstract void start();
	abstract void stop();
	//comt
	//myedit
}

class Car extends Vehicle
{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Car started driving");
		
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
		Vehicle d=new Car();
		d.start();
		c.start();
		c.stop();
		d.stop();
		Car cc=new Car();
		cc.drive();
	}
	
}

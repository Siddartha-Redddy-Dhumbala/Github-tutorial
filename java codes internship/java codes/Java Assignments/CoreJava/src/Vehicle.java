class Car {
	public void Car1() {
		System.out.println("Class Car");
	}

	public void vehicleType() {
		System.out.println("Vehicle Type: Car");
	}

	void display() {
		System.out.println("This is car");
	}

	class Maruti extends Car {
		public void Maruti1() {
			System.out.println("Class Maruti");
		}

		public void brand() {
			System.out.println("Brand: Maruti");
		}

		public void display() {
			System.out.println("This is Maruti car");
		}
	}

	class Maruti800 extends Maruti {

		public void Maruti8001() {
			System.out.println("Maruti Model: 800");
		}

		public void speed() {
			System.out.println("Max: 80Kmph");
		}

		public void display() {
			System.out.println("this is Maruti 800");
		}
	}

	class Tester {

		public void main(String[] args) {
			
		
			Car obj1 = new Car();
			Maruti obj2 = new Maruti();
			Maruti800 obj3 = new Maruti800();
			
			obj1.Car1();
			obj1.vehicleType();
			obj1.display();
			
			obj2.Maruti1();
			obj2.brand();
			obj2.display();
			
			obj3.Maruti8001();
			obj3.speed();
			obj3.display();
			
			
			
			
			
			
			
			
		}
	}

	
}
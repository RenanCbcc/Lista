package double_ended_lists;

import data.Car;

public class FirstLastApp {

	public static void main(String[] args) {
		FirstLastList<Car> list = new FirstLastList<Car>();
		
		list.insertFirst(new Car("Demon", 100000));
		list.insertFirst(new Car("Apollo", 100000));
		list.insertFirst(new Car("Blackhawk", 106000));

		list.insertLast(new Car("Mirage", 180000));
		list.insertLast(new Car("Conquest", 280000));
		list.insertLast(new Car("Ranger", 345000));
		list.insertLast(new Car("Beethoven", 500000));
		
		list.displayList();
		
		list.deleteFirst();
		list.deleteFirst();
		
		list.displayList();
	}

}
